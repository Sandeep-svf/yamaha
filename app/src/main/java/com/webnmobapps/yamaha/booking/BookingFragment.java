package com.webnmobapps.yamaha.booking;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;


public class BookingFragment extends Fragment {


    AppCompatImageView book_imag_1, book_imag_2;
    AppCompatTextView book_tx1,book_tx2,sub_layout1,user_name_book,user_email_book;
    AppCompatButton book_now_button;

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_booking, container, false);

        inits(view);




        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            book_tx1.setTypeface(typeface);
            sub_layout1 .setTypeface(typeface);
            user_name_book .setTypeface(typeface);
            book_now_button .setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            book_tx2.setTypeface(typeface);
            user_email_book.setTypeface(typeface);

        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            book_tx1.setTypeface(typeface);
            sub_layout1 .setTypeface(typeface);
            user_name_book .setTypeface(typeface);
            book_now_button .setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            book_tx2.setTypeface(typeface);
            user_email_book.setTypeface(typeface);


        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }
        
        

        Glide.with(getActivity()).load(R.drawable.music_friend_course_image).placeholder(R.drawable.ic_launcher_background).into(book_imag_1);
        Glide.with(getActivity()).load(R.drawable.book_banner2).placeholder(R.drawable.ic_launcher_background).into(book_imag_2);

        return view;
    }

    private void inits(View view) {
        
        user_name_book = view.findViewById(R.id.user_name_book);
        user_email_book = view.findViewById(R.id.user_email_book);
        sub_layout1 = view.findViewById(R.id.sub_layout1);
        book_tx2 = view.findViewById(R.id.book_tx2);
        book_tx1 = view.findViewById(R.id.book_tx1);
        book_now_button = view.findViewById(R.id.book_now_button);
        book_imag_1 = view.findViewById(R.id.book_imag_1);
        book_imag_2 = view.findViewById(R.id.book_imag_2);

    }
}
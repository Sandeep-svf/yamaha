package com.webnmobapps.yamaha.events;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.courses.CourseFragment;
import com.webnmobapps.yamaha.utility.StaticKey;

public class PreviousEventDetailsFragment extends Fragment {

    AppCompatImageView previous_event_details_imag_2, previous_event_details_imag_1,back_arrow_image;
    AppCompatTextView previous_text,text_script,user_name_text25,march_text;

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_previous_event_details, container, false);
        intis(view);



        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            march_text.setTypeface(typeface);
            user_name_text25.setTypeface(typeface);
            previous_text.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            text_script.setTypeface(typeface);



        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            march_text.setTypeface(typeface);
            user_name_text25.setTypeface(typeface);
            previous_text.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            text_script.setTypeface(typeface);






        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }





        try {
            Glide.with(getActivity()).load(R.drawable.music_friend_course_image).placeholder(R.drawable.ic_launcher_background).into(previous_event_details_imag_1);
            Glide.with(getActivity()).load(R.drawable.event_banner).placeholder(R.drawable.ic_launcher_background).into(previous_event_details_imag_2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // Toast.makeText(getActivity(), "Something went wrong while loading banner image.", Toast.LENGTH_SHORT).show();
        }

        back_arrow_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventFragment pageFragment = new EventFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return view;
    }

    private void intis(View view) {



        march_text = view.findViewById(R.id.march_text);
                user_name_text25 = view.findViewById(R.id.user_name_text25);
        text_script = view.findViewById(R.id.text_script);
        previous_text = view.findViewById(R.id.previous_text);
        previous_event_details_imag_2 = view.findViewById(R.id.previous_event_details_imag_2);
        previous_event_details_imag_1 = view.findViewById(R.id.previous_event_details_imag_1);
        back_arrow_image = view.findViewById(R.id.back_arrow_image);
    }
}
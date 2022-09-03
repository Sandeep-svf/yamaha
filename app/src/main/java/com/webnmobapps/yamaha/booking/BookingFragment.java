package com.webnmobapps.yamaha.booking;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;


public class BookingFragment extends Fragment {


    AppCompatImageView book_imag_1, book_imag_2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_booking, container, false);

        inits(view);

        Glide.with(getActivity()).load(R.drawable.music_friend_course_image).placeholder(R.drawable.ic_launcher_background).into(book_imag_1);
        Glide.with(getActivity()).load(R.drawable.book_banner2).placeholder(R.drawable.ic_launcher_background).into(book_imag_2);

        return view;
    }

    private void inits(View view) {

        book_imag_1 = view.findViewById(R.id.book_imag_1);
        book_imag_2 = view.findViewById(R.id.book_imag_2);

    }
}
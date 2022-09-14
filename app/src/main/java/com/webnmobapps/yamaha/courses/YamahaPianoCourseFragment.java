package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;


public class YamahaPianoCourseFragment extends Fragment {
    AppCompatImageView piano_course_imag_1,piano_course_imag_2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_yamaha_piano_course, container, false);
        intis(view);

        try {
            Glide.with(getActivity()).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(piano_course_imag_1);
            Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(piano_course_imag_2);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            Toast.makeText(getActivity(), "Something went wrong while loading image.....", Toast.LENGTH_SHORT).show();
        }


        return view;
    }

    private void intis(View view) {
        piano_course_imag_1 = view.findViewById(R.id.piano_course_imag_1);
        piano_course_imag_2 = view.findViewById(R.id.piano_course_imag_2);
    }
}
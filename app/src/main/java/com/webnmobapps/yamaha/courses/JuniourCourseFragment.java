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


public class JuniourCourseFragment extends Fragment {


    AppCompatImageView junior_course_imag_1,junior_course_imag_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_juniour_course, container, false);

        try {
            Glide.with(getActivity()).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_1);
            Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_2);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            Toast.makeText(getActivity(), "Something went wrong while loading image.....", Toast.LENGTH_SHORT).show();
        }

        init(view);

        return  view;
    }

    private void init(View view) {
        junior_course_imag_1 = view.findViewById(R.id.junior_course_imag_1);
        junior_course_imag_2 = view.findViewById(R.id.junior_course_imag_2);
    }
}
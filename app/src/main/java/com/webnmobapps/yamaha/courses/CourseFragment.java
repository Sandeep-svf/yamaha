package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;


public class CourseFragment extends Fragment {

    AppCompatImageView course_banner_image;
    RecyclerView rcv_courses;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_course, container, false);
        intis(view);

        Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(course_banner_image);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        CourcesAdapter courcesAdapter = new CourcesAdapter(getActivity());
        rcv_courses.setLayoutManager(linearLayoutManager);
        rcv_courses.setAdapter(courcesAdapter);

        return  view;
    }

    private void intis(View view) {
        course_banner_image = view.findViewById(R.id.course_banner_image);
        rcv_courses = view.findViewById(R.id.rcv_courses);
    }
}
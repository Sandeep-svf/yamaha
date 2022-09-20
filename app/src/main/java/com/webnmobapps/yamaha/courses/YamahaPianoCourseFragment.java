package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;


public class YamahaPianoCourseFragment extends Fragment {
    AppCompatImageView piano_course_imag_1,piano_course_imag_2;
    AppCompatButton yamaha_piano_button_jxc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_yamaha_piano_course, container, false);
        intis(view);

        try {
            Glide.with(getActivity()).load(R.drawable.yamaha_piano_course).placeholder(R.drawable.ic_launcher_background).into(piano_course_imag_1);
            Glide.with(getActivity()).load(R.drawable.piano_123).placeholder(R.drawable.ic_launcher_background).into(piano_course_imag_2);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
           // Toast.makeText(getActivity(), "Something went wrong while loading image.....", Toast.LENGTH_SHORT).show();
        }

        yamaha_piano_button_jxc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return view;
    }

    private void intis(View view) {
        piano_course_imag_1 = view.findViewById(R.id.piano_course_imag_1);
        piano_course_imag_2 = view.findViewById(R.id.piano_course_imag_2);
        yamaha_piano_button_jxc = view.findViewById(R.id.yamaha_piano_button_jxc);
    }
}
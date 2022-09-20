package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;


public class MusicFriendCourseFragment extends Fragment {

    AppCompatButton music_friend_course_fee_1,music_friend_course_fee_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music_friend_course, container, false);
        intis(view);

        music_friend_course_fee_1.setOnClickListener(new View.OnClickListener() {
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

        music_friend_course_fee_2.setOnClickListener(new View.OnClickListener() {
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


        return  view;
    }

    private void intis(View view) {
        music_friend_course_fee_1 = view.findViewById(R.id.music_friend_course_fee_1);
        music_friend_course_fee_2 = view.findViewById(R.id.music_friend_course_fee_2);
    }
}
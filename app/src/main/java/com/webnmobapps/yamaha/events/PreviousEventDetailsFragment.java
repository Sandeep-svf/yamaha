package com.webnmobapps.yamaha.events;

import android.os.Bundle;

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
import com.webnmobapps.yamaha.courses.CourseFragment;

public class PreviousEventDetailsFragment extends Fragment {

    AppCompatImageView previous_event_details_imag_2, previous_event_details_imag_1,back_arrow_image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_previous_event_details, container, false);
        intis(view);

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
        previous_event_details_imag_2 = view.findViewById(R.id.previous_event_details_imag_2);
        previous_event_details_imag_1 = view.findViewById(R.id.previous_event_details_imag_1);
        back_arrow_image = view.findViewById(R.id.back_arrow_image);
    }
}
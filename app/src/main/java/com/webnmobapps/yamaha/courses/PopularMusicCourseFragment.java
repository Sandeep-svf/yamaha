package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;


public class PopularMusicCourseFragment extends Fragment {


    AppCompatImageView image_view_acoustic_guitar,image_view_electric_guitar,image_view_electric_bass;
    ConstraintLayout linear_layout_acoustic_guitar,linear_layout_eletric_guitar, linear_layout_eletric_bass;
    Boolean flag_coustic_guitar = true;
    Boolean flag_electric_guitar = true;
    Boolean flag_electric_bass = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popular_music_course, container, false);
        intis(view);

        image_view_acoustic_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear_layout_acoustic_guitar.setVisibility(View.VISIBLE);
                linear_layout_eletric_guitar.setVisibility(View.GONE);
                linear_layout_eletric_bass.setVisibility(View.GONE);
                image_view_acoustic_guitar.setImageResource(R.drawable.down_arrow);
                image_view_electric_guitar.setImageResource(R.drawable.course_details);
                image_view_electric_bass.setImageResource(R.drawable.course_details);
                flag_coustic_guitar = false;
                flag_electric_guitar = true;
                flag_electric_bass = true;

            }
        });

        image_view_electric_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear_layout_acoustic_guitar.setVisibility(View.GONE);
                linear_layout_eletric_guitar.setVisibility(View.VISIBLE);
                linear_layout_eletric_bass.setVisibility(View.GONE);
                image_view_acoustic_guitar.setImageResource(R.drawable.course_details);
                image_view_electric_guitar.setImageResource(R.drawable.down_arrow);
                image_view_electric_bass.setImageResource(R.drawable.course_details);
                flag_coustic_guitar = true;
                flag_electric_guitar = false;
                flag_electric_bass = true;

            }
        });
        image_view_electric_bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linear_layout_acoustic_guitar.setVisibility(View.GONE);
                linear_layout_eletric_guitar.setVisibility(View.GONE);
                linear_layout_eletric_bass.setVisibility(View.VISIBLE);
                image_view_acoustic_guitar.setImageResource(R.drawable.course_details);
                image_view_electric_guitar.setImageResource(R.drawable.course_details);
                image_view_electric_bass.setImageResource(R.drawable.down_arrow);
                flag_coustic_guitar = true;
                flag_electric_guitar = true;
                flag_electric_bass = false;
            }
        });




        return view;
    }

    private void intis(View view) {
        image_view_acoustic_guitar = view.findViewById(R.id.image_view_acoustic_guitar);
        image_view_electric_guitar = view.findViewById(R.id.image_view_electric_guitar);
        image_view_electric_bass = view.findViewById(R.id.image_view_electric_bass);
        linear_layout_acoustic_guitar = view.findViewById(R.id.jmc_attatched_layout);
        linear_layout_eletric_guitar = view.findViewById(R.id.jxc_attatched_layout);
        linear_layout_eletric_bass = view.findViewById(R.id.jnc_attatched_layout);
    }
}
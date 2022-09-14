package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;


public class JuniourCourseFragment extends Fragment {


    AppCompatImageView junior_course_imag_1,junior_course_imag_2,image_view_jmc,image_view_jxc,image_view_jnc,image_view_anc;
    Boolean flag_jmc = true;
    Boolean flag_jxc = true;
    Boolean flag_jnc = true;
    Boolean flag_anc = true;
    ConstraintLayout jmc_attatched_layout,jxc_attatched_layout,jnc_attatched_layout,anc_attatched_layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_juniour_course, container, false);

        init(view);

        try {
            Glide.with(getActivity()).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_1);
            Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_2);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            Toast.makeText(getActivity(), "Something went wrong while loading image.....", Toast.LENGTH_SHORT).show();
        }

        image_view_jnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag_jnc){
                    jnc_attatched_layout.setVisibility(View.VISIBLE);
                    jmc_attatched_layout.setVisibility(View.GONE);
                    jxc_attatched_layout.setVisibility(View.GONE);
                    anc_attatched_layout.setVisibility(View.GONE);
                    image_view_jnc.setImageResource(R.drawable.down_arrow);
                    image_view_anc.setImageResource(R.drawable.course_details);
                    image_view_jmc.setImageResource(R.drawable.course_details);
                    image_view_jxc.setImageResource(R.drawable.course_details);
                    flag_jnc = false;
                    flag_jxc = true;
                    flag_jmc = true;
                    flag_anc = true;
                }else{
                    jnc_attatched_layout.setVisibility(View.GONE);
                    image_view_jnc.setImageResource(R.drawable.course_details);
                    flag_jnc = true;
                }
            }
        });


        image_view_anc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag_anc){
                    anc_attatched_layout.setVisibility(View.VISIBLE);
                    jmc_attatched_layout.setVisibility(View.GONE);
                    jxc_attatched_layout.setVisibility(View.GONE);
                    jnc_attatched_layout.setVisibility(View.GONE);
                    image_view_anc.setImageResource(R.drawable.down_arrow);
                    image_view_jmc.setImageResource(R.drawable.course_details);
                    image_view_jnc.setImageResource(R.drawable.course_details);
                    image_view_jxc.setImageResource(R.drawable.course_details);
                    flag_anc = false;
                    flag_jxc = true;
                    flag_jmc = true;
                    flag_jnc = true;
                }else{
                    anc_attatched_layout.setVisibility(View.GONE);
                    image_view_anc.setImageResource(R.drawable.course_details);
                    flag_anc = true;
                }
            }
        });

        image_view_jmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(flag_jmc){
                        jmc_attatched_layout.setVisibility(View.VISIBLE);
                        anc_attatched_layout.setVisibility(View.GONE);
                        jxc_attatched_layout.setVisibility(View.GONE);
                        anc_attatched_layout.setVisibility(View.GONE);
                        image_view_jmc.setImageResource(R.drawable.down_arrow);
                        image_view_anc.setImageResource(R.drawable.course_details);
                        image_view_jnc.setImageResource(R.drawable.course_details);
                        image_view_jxc.setImageResource(R.drawable.course_details);
                        flag_jmc = false;
                        flag_jxc = true;
                        flag_jnc = true;
                        flag_anc = true;
                    }else{
                        jmc_attatched_layout.setVisibility(View.GONE);
                        image_view_jmc.setImageResource(R.drawable.course_details);
                        flag_jmc = true;
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        image_view_jxc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag_jxc){
                    jxc_attatched_layout.setVisibility(View.VISIBLE);
                    jmc_attatched_layout.setVisibility(View.GONE);
                    jnc_attatched_layout.setVisibility(View.GONE);
                    anc_attatched_layout.setVisibility(View.GONE);
                    image_view_jxc.setImageResource(R.drawable.down_arrow);
                    image_view_anc.setImageResource(R.drawable.course_details);
                    image_view_jnc.setImageResource(R.drawable.course_details);
                    image_view_jmc.setImageResource(R.drawable.course_details);
                    flag_jxc = false;
                    flag_jnc = true;
                    flag_jmc = true;
                    flag_anc = true;
                }else{
                    jxc_attatched_layout.setVisibility(View.GONE);
                    image_view_jxc.setImageResource(R.drawable.course_details);
                    flag_jxc = true;

                }
            }
        });


        return  view;
    }

    private void init(View view) {
        junior_course_imag_1 = view.findViewById(R.id.junior_course_imag_1);
        junior_course_imag_2 = view.findViewById(R.id.junior_course_imag_2);
        image_view_jmc = view.findViewById(R.id.image_view_jmc);
        jmc_attatched_layout = view.findViewById(R.id.jmc_attatched_layout);
        jxc_attatched_layout = view.findViewById(R.id.jxc_attatched_layout);
        image_view_jxc = view.findViewById(R.id.image_view_jxc);
        image_view_jnc = view.findViewById(R.id.image_view_jnc);
        image_view_anc = view.findViewById(R.id.image_view_anc);
        jnc_attatched_layout = view.findViewById(R.id.jnc_attatched_layout);
        anc_attatched_layout = view.findViewById(R.id.anc_attatched_layout);
    }
}
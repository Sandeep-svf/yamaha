package com.webnmobapps.yamaha.courses;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;
import com.webnmobapps.yamaha.utility.StaticKey;


public class JuniourCourseFragment extends Fragment {

    AppCompatButton course_fee_button_jxc,fee_structure_button_jmc,course_fee_button_jnc,course_fee_button_anc;
    AppCompatImageView junior_course_imag_1,junior_course_imag_2,image_view_jmc,image_view_jxc,image_view_jnc,image_view_anc;
    Boolean flag_jmc = true;
    Boolean flag_jxc = true;
    Boolean flag_jnc = true;
    Boolean flag_anc = true;
    ConstraintLayout jmc_attatched_layout,jxc_attatched_layout,jnc_attatched_layout,anc_attatched_layout;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;
    AppCompatTextView course_type,course_title,course_description,jc_txt1,jc_txt2,ps1,ps2,ps3,ps4,ps5,ps6,
            ps1_heading,ps2_heading,ps3_heading,ps4_heading,jmc_text1,jmc_text2,text_beside_image,text2_beside_image,cd_text1,total_student_jmc,
            total_student_jmc2,number_of_lession_jmc,number_of_lession_jmc2,course_material_jmc,course_material_jmc2,course_material_jmc3,
            course_material_jmc4,course_material_jmc5,lession_duration_jmc,lession_duration_jmc2,course_setting,course_setting2;

    AppCompatTextView jxc_text1,jxc_text2,text_beside_image_jxc,text2_beside_image_jxc,cd_text1_jxc,number_of_lession_jxc2,total_student_jxc2,
    course_setting_jmc2,lession_duration_jxc2,course_material_jxc5,course_material_jxc4,course_material_jxc3,course_material_jxc2,
            course_material_jxc,lession_duration_jxc,course_setting_jmc,total_student_jxc,number_of_lession_jxc;

    AppCompatTextView jnc_text1,text_beside_image_jnc,text2_beside_image_jnc,cd_text1_jnc,total_student_jnc,


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_juniour_course, container, false);

        init(view);

        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_extrabold);
            cd_text1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            course_fee_button_anc.setTypeface(typeface);
            course_fee_button_jnc.setTypeface(typeface);
            fee_structure_button_jmc.setTypeface(typeface);
            course_fee_button_jxc.setTypeface(typeface);
            number_of_lession_jxc.setTypeface(typeface);
            total_student_jxc.setTypeface(typeface);
            course_setting_jmc.setTypeface(typeface);
            course_material_jxc.setTypeface(typeface);
            lession_duration_jxc.setTypeface(typeface);
            course_type.setTypeface(typeface);
            jc_txt1.setTypeface(typeface);
            ps1_heading.setTypeface(typeface);
            ps2_heading.setTypeface(typeface);
            ps3_heading.setTypeface(typeface);
            ps4_heading.setTypeface(typeface);
            course_fee_button_jxc.setTypeface(typeface);
            text_beside_image.setTypeface(typeface);
            total_student_jmc.setTypeface(typeface);
            total_student_jmc2.setTypeface(typeface);
            number_of_lession_jmc.setTypeface(typeface);
            number_of_lession_jmc2.setTypeface(typeface);
            course_material_jmc.setTypeface(typeface);
            course_material_jmc2.setTypeface(typeface);
            course_material_jmc3.setTypeface(typeface);
            course_material_jmc4.setTypeface(typeface);
            course_material_jmc5.setTypeface(typeface);
            lession_duration_jmc.setTypeface(typeface);
            lession_duration_jmc2.setTypeface(typeface);
            course_setting.setTypeface(typeface);
            course_setting2.setTypeface(typeface);
            text_beside_image_jxc.setTypeface(typeface);
            cd_text1_jxc.setTypeface(typeface);
            number_of_lession_jxc2.setTypeface(typeface);
            total_student_jxc2.setTypeface(typeface);
            course_setting_jmc2.setTypeface(typeface);
            lession_duration_jxc2.setTypeface(typeface);
            course_material_jxc5.setTypeface(typeface);
            course_material_jxc4.setTypeface(typeface);
            course_material_jxc3.setTypeface(typeface);
            course_material_jxc2.setTypeface(typeface);



            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            course_title.setTypeface(typeface);
            course_description.setTypeface(typeface);
            jc_txt2.setTypeface(typeface);
            ps1.setTypeface(typeface);
            ps2.setTypeface(typeface);
            ps3.setTypeface(typeface);
            ps4.setTypeface(typeface);
            ps5.setTypeface(typeface);
            ps6.setTypeface(typeface);
            jmc_text1.setTypeface(typeface);
            jmc_text2.setTypeface(typeface);
            text2_beside_image.setTypeface(typeface);
            jxc_text2.setTypeface(typeface);
            jxc_text1.setTypeface(typeface);
            text2_beside_image_jxc.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_extrabold);
            cd_text1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            course_fee_button_anc.setTypeface(typeface);
            course_fee_button_jnc.setTypeface(typeface);
            fee_structure_button_jmc.setTypeface(typeface);
            course_fee_button_jxc.setTypeface(typeface);
            number_of_lession_jxc.setTypeface(typeface);
            total_student_jxc.setTypeface(typeface);
            course_setting_jmc.setTypeface(typeface);
            course_material_jxc.setTypeface(typeface);
            lession_duration_jxc.setTypeface(typeface);
            course_type.setTypeface(typeface);
            jc_txt1.setTypeface(typeface);
            ps1_heading.setTypeface(typeface);
            ps2_heading.setTypeface(typeface);
            ps3_heading.setTypeface(typeface);
            ps4_heading.setTypeface(typeface);
            course_fee_button_jxc.setTypeface(typeface);
            text_beside_image.setTypeface(typeface);
            total_student_jmc.setTypeface(typeface);
            total_student_jmc2.setTypeface(typeface);
            number_of_lession_jmc.setTypeface(typeface);
            number_of_lession_jmc2.setTypeface(typeface);
            course_material_jmc.setTypeface(typeface);
            course_material_jmc2.setTypeface(typeface);
            course_material_jmc3.setTypeface(typeface);
            course_material_jmc4.setTypeface(typeface);
            course_material_jmc5.setTypeface(typeface);
            lession_duration_jmc.setTypeface(typeface);
            lession_duration_jmc2.setTypeface(typeface);
            course_setting.setTypeface(typeface);
            course_setting2.setTypeface(typeface);
            text_beside_image_jxc.setTypeface(typeface);
            cd_text1_jxc.setTypeface(typeface);
            number_of_lession_jxc2.setTypeface(typeface);
            total_student_jxc2.setTypeface(typeface);
            course_setting_jmc2.setTypeface(typeface);
            lession_duration_jxc2.setTypeface(typeface);
            course_material_jxc5.setTypeface(typeface);
            course_material_jxc4.setTypeface(typeface);
            course_material_jxc3.setTypeface(typeface);
            course_material_jxc2.setTypeface(typeface);




            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            course_title.setTypeface(typeface);
            course_description.setTypeface(typeface);
            jc_txt2.setTypeface(typeface);
            ps1.setTypeface(typeface);
            ps2.setTypeface(typeface);
            ps3.setTypeface(typeface);
            ps4.setTypeface(typeface);
            ps5.setTypeface(typeface);
            ps6.setTypeface(typeface);
            jmc_text1.setTypeface(typeface);
            jmc_text2.setTypeface(typeface);
            text2_beside_image.setTypeface(typeface);
            jxc_text2.setTypeface(typeface);
            jxc_text1.setTypeface(typeface);
            text2_beside_image_jxc.setTypeface(typeface);

        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }


        try {
            Glide.with(getActivity()).load(R.drawable.juniour_course_banner_image).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_1);
            Glide.with(getActivity()).load(R.drawable.juniour_course).placeholder(R.drawable.ic_launcher_background).into(junior_course_imag_2);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
           //    Toast.makeText(getActivity(), "Something went wrong while loading image.....", Toast.LENGTH_SHORT).show();
        }

        course_fee_button_anc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/

                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);
            }
        });

        course_fee_button_jnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);
            }
        });

        fee_structure_button_jmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/

                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);
            }
        });

        course_fee_button_jxc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);
            }
        });

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

        course_type = view.findViewById(R.id.course_type);
        course_title = view.findViewById(R.id.course_title);
        course_description = view.findViewById(R.id.course_description);
        jc_txt1 = view.findViewById(R.id.jc_txt1);
        jc_txt2 = view.findViewById(R.id.jc_txt2);
        ps1 = view.findViewById(R.id.ps1);
        ps2 = view.findViewById(R.id.ps2);
        ps3 = view.findViewById(R.id.ps3);
        ps4 = view.findViewById(R.id.ps4);
        ps5 = view.findViewById(R.id.ps5);
        ps6 = view.findViewById(R.id.ps6);
        ps1_heading = view.findViewById(R.id.ps1_heading);
        ps2_heading = view.findViewById(R.id.ps2_heading);
        ps3_heading = view.findViewById(R.id.ps3_heading);
        ps4_heading = view.findViewById(R.id.ps4_heading);
        jmc_text1 = view.findViewById(R.id.jmc_text1);
        jmc_text2 = view.findViewById(R.id.jmc_text2);
        text_beside_image = view.findViewById(R.id.text_beside_image);
        text2_beside_image = view.findViewById(R.id.text2_beside_image);
        cd_text1 = view.findViewById(R.id.cd_text1);
        total_student_jmc = view.findViewById(R.id.total_student_jmc);
        total_student_jmc2 = view.findViewById(R.id.total_student_jmc2);
        number_of_lession_jmc = view.findViewById(R.id.number_of_lession_jmc);
        number_of_lession_jmc2 = view.findViewById(R.id.number_of_lession_jmc2);
        course_material_jmc = view.findViewById(R.id.course_material_jmc);
        course_material_jmc2 = view.findViewById(R.id.course_material_jmc2);
        course_material_jmc3 = view.findViewById(R.id.course_material_jmc3);
        course_material_jmc4 = view.findViewById(R.id.course_material_jmc4);
        course_material_jmc5 = view.findViewById(R.id.course_material_jmc5);
        lession_duration_jmc = view.findViewById(R.id.lession_duration_jmc);
        lession_duration_jmc2 = view.findViewById(R.id.lession_duration_jmc2);
        course_setting = view.findViewById(R.id.course_setting);
        course_setting2 = view.findViewById(R.id.course_setting2);
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
        course_fee_button_jxc = view.findViewById(R.id.course_fee_button_jxc);
        fee_structure_button_jmc = view.findViewById(R.id.fee_structure_button_jmc);
        course_fee_button_jnc = view.findViewById(R.id.course_fee_button_jnc);
        course_fee_button_anc = view.findViewById(R.id.course_fee_button_anc);
        jxc_text1 = view.findViewById(R.id.jxc_text1);
        jxc_text2 = view.findViewById(R.id.jxc_text2);
        text_beside_image_jxc = view.findViewById(R.id.text_beside_image_jxc);
        text2_beside_image_jxc = view.findViewById(R.id.text2_beside_image_jxc);
        cd_text1_jxc = view.findViewById(R.id.cd_text1_jxc);
        number_of_lession_jxc2 = view.findViewById(R.id.number_of_lession_jxc2);
        total_student_jxc2 = view.findViewById(R.id.total_student_jxc2);
        course_setting_jmc2 = view.findViewById(R.id.course_setting_jmc2);
        lession_duration_jxc2 = view.findViewById(R.id.lession_duration_jxc2);
        course_material_jxc5 = view.findViewById(R.id.course_material_jxc5);
        course_material_jxc4 = view.findViewById(R.id.course_material_jxc4);
        course_material_jxc3 = view.findViewById(R.id.course_material_jxc3);
        course_material_jxc2 = view.findViewById(R.id.course_material_jxc2);
        number_of_lession_jxc = view.findViewById(R.id.number_of_lession_jxc);
        total_student_jxc = view.findViewById(R.id.total_student_jxc);
        course_setting_jmc = view.findViewById(R.id.course_setting_jmc);
        lession_duration_jxc = view.findViewById(R.id.lession_duration_jxc);
        course_material_jxc = view.findViewById(R.id.course_material_jxc);


    }
}
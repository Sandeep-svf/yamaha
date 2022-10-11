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

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;
import com.webnmobapps.yamaha.utility.StaticKey;


public class PopularMusicCourseFragment extends Fragment {

    AppCompatImageView image_view_acoustic_guitar,image_view_electric_guitar,image_view_electric_bass;
    ConstraintLayout linear_layout_acoustic_guitar,linear_layout_eletric_guitar, linear_layout_eletric_bass;
    Boolean flag_coustic_guitar = true;
    Boolean flag_electric_guitar = true;
    Boolean flag_electric_bass = true;
    AppCompatButton popular_course_course_fee_1, popular_course_course_fee_2, popular_course_course_fee_3;

    AppCompatTextView pmc_tx1,pmc_tx2,pmc_tx3,pmc_tx4,pmc_tx5,pmc_tx6,pmc_tx7,pmc_tx8,pmc_tx9,pmc_tx10,pmc_tx11,pmc_tx12,pmc_tx13,pmc_tx14;

    AppCompatTextView jmc_text1,jmc_text2,pmc_tx15,pmc_tx16,pmc_tx17,pmc_tx18,pmc_tx19,cd_text1,total_student_ag,total_student_ag2 ,course_setting_ag
            ,course_setting_ag2,course_setting_ag3,couse_duration_ag,couse_duration_ag2,course_material_ag3,course_material_ag2,course_material_ag;


    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popular_music_course, container, false);
        intis(view);



        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_extrabold);



            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);

            pmc_tx1.setTypeface(typeface);
            pmc_tx2.setTypeface(typeface);
            popular_course_course_fee_3.setTypeface(typeface);
            popular_course_course_fee_2.setTypeface(typeface);
            popular_course_course_fee_1.setTypeface(typeface);
            pmc_tx9.setTypeface(typeface);


            //################################################

            course_material_ag.setTypeface(typeface);
            course_material_ag2.setTypeface(typeface);
            course_material_ag3.setTypeface(typeface);
            couse_duration_ag2.setTypeface(typeface);
            couse_duration_ag.setTypeface(typeface);
            course_setting_ag3.setTypeface(typeface);
            course_setting_ag2.setTypeface(typeface);
            course_setting_ag.setTypeface(typeface);
            total_student_ag2.setTypeface(typeface);
            total_student_ag.setTypeface(typeface);
            cd_text1.setTypeface(typeface);




            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
          //  text2_beside_image_jnc.setTypeface(typeface);
            pmc_tx3.setTypeface(typeface);
            pmc_tx4.setTypeface(typeface);
            pmc_tx5.setTypeface(typeface);
            pmc_tx6.setTypeface(typeface);
            pmc_tx7.setTypeface(typeface);
            pmc_tx8.setTypeface(typeface);
            pmc_tx10.setTypeface(typeface);
            pmc_tx11.setTypeface(typeface);
            pmc_tx12.setTypeface(typeface);
            pmc_tx13.setTypeface(typeface);
            pmc_tx14.setTypeface(typeface);

            //##############################

            jmc_text1.setTypeface(typeface);
            jmc_text2.setTypeface(typeface);
            pmc_tx15.setTypeface(typeface);
            pmc_tx16.setTypeface(typeface);
            pmc_tx17.setTypeface(typeface);
            pmc_tx18.setTypeface(typeface);
            pmc_tx19.setTypeface(typeface);



        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_extrabold);
          //  cd_text1.setTypeface(typeface);



            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
         //   course_fee_button_anc.setTypeface(typeface);
            pmc_tx1.setTypeface(typeface);
            pmc_tx2.setTypeface(typeface);
            popular_course_course_fee_3.setTypeface(typeface);
            popular_course_course_fee_2.setTypeface(typeface);
            popular_course_course_fee_1.setTypeface(typeface);
            pmc_tx9.setTypeface(typeface);

            //###################################
            course_material_ag.setTypeface(typeface);
            course_material_ag2.setTypeface(typeface);
            course_material_ag3.setTypeface(typeface);
            couse_duration_ag2.setTypeface(typeface);
            couse_duration_ag.setTypeface(typeface);
            course_setting_ag3.setTypeface(typeface);
            course_setting_ag2.setTypeface(typeface);
            course_setting_ag.setTypeface(typeface);
            total_student_ag2.setTypeface(typeface);
            total_student_ag.setTypeface(typeface);
            cd_text1.setTypeface(typeface);





            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
       //     text2_beside_image_jnc.setTypeface(typeface);
            pmc_tx3.setTypeface(typeface);
            pmc_tx4.setTypeface(typeface);
            pmc_tx5.setTypeface(typeface);
            pmc_tx6.setTypeface(typeface);
            pmc_tx7.setTypeface(typeface);
            pmc_tx8.setTypeface(typeface);
            pmc_tx10.setTypeface(typeface);
            pmc_tx11.setTypeface(typeface);
            pmc_tx12.setTypeface(typeface);
            pmc_tx13.setTypeface(typeface);
            pmc_tx14.setTypeface(typeface);

            //#########################
            jmc_text1.setTypeface(typeface);
            jmc_text2.setTypeface(typeface);
            pmc_tx15.setTypeface(typeface);
            pmc_tx16.setTypeface(typeface);
            pmc_tx17.setTypeface(typeface);
            pmc_tx18.setTypeface(typeface);
            pmc_tx19.setTypeface(typeface);


        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }



        popular_course_course_fee_3.setOnClickListener(new View.OnClickListener() {
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

        popular_course_course_fee_2.setOnClickListener(new View.OnClickListener() {
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


        popular_course_course_fee_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           /*     FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/

                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);
            }
        });

        image_view_acoustic_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_coustic_guitar) {
                    linear_layout_acoustic_guitar.setVisibility(View.VISIBLE);
                    linear_layout_eletric_guitar.setVisibility(View.GONE);
                    linear_layout_eletric_bass.setVisibility(View.GONE);
                    image_view_acoustic_guitar.setImageResource(R.drawable.down_arrow);
                    image_view_electric_guitar.setImageResource(R.drawable.course_details);
                    image_view_electric_bass.setImageResource(R.drawable.course_details);
                    flag_coustic_guitar = false;
                    flag_electric_guitar = true;
                    flag_electric_bass = true;
                } else {
                    linear_layout_acoustic_guitar.setVisibility(View.GONE);
                    image_view_acoustic_guitar.setImageResource(R.drawable.course_details);
                    flag_coustic_guitar = true;
                }

            }
        });

        image_view_electric_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_electric_guitar) {
                    linear_layout_acoustic_guitar.setVisibility(View.GONE);
                    linear_layout_eletric_guitar.setVisibility(View.VISIBLE);
                    linear_layout_eletric_bass.setVisibility(View.GONE);
                    image_view_acoustic_guitar.setImageResource(R.drawable.course_details);
                    image_view_electric_guitar.setImageResource(R.drawable.down_arrow);
                    image_view_electric_bass.setImageResource(R.drawable.course_details);
                    flag_coustic_guitar = true;
                    flag_electric_guitar = false;
                    flag_electric_bass = true;
                } else {
                    linear_layout_eletric_guitar.setVisibility(View.GONE);
                    image_view_electric_guitar.setImageResource(R.drawable.course_details);
                    flag_electric_guitar = true;
                }

            }
        });
        image_view_electric_bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag_electric_bass) {
                    linear_layout_acoustic_guitar.setVisibility(View.GONE);
                    linear_layout_eletric_guitar.setVisibility(View.GONE);
                    linear_layout_eletric_bass.setVisibility(View.VISIBLE);
                    image_view_acoustic_guitar.setImageResource(R.drawable.course_details);
                    image_view_electric_guitar.setImageResource(R.drawable.course_details);
                    image_view_electric_bass.setImageResource(R.drawable.down_arrow);
                    flag_coustic_guitar = true;
                    flag_electric_guitar = true;
                    flag_electric_bass = false;
                } else {
                    linear_layout_eletric_bass.setVisibility(View.GONE);
                    image_view_electric_bass.setImageResource(R.drawable.course_details);
                    flag_electric_bass = true;
                }
            }
        });

        return view;
    }

    private void intis(View view) {

        course_material_ag = view.findViewById(R.id.course_material_ag);
        course_material_ag2 = view.findViewById(R.id.course_material_ag2);
        course_material_ag3 = view.findViewById(R.id.course_material_ag3);
        couse_duration_ag2 = view.findViewById(R.id.couse_duration_ag2);
        couse_duration_ag = view.findViewById(R.id.couse_duration_ag);
        course_setting_ag3 = view.findViewById(R.id.course_setting_ag3);
        course_setting_ag2 = view.findViewById(R.id.course_setting_ag2);
        course_setting_ag = view.findViewById(R.id.course_setting_ag);
        total_student_ag2 = view.findViewById(R.id.total_student_ag2);
        total_student_ag = view.findViewById(R.id.total_student_ag);
        cd_text1 = view.findViewById(R.id.cd_text1);
        pmc_tx19 = view.findViewById(R.id.pmc_tx19);
        pmc_tx18 = view.findViewById(R.id.pmc_tx18);
        pmc_tx17 = view.findViewById(R.id.pmc_tx17);
        pmc_tx16 = view.findViewById(R.id.pmc_tx16);
        pmc_tx15 = view.findViewById(R.id.pmc_tx15);
        jmc_text2 = view.findViewById(R.id.jmc_text2);
        jmc_text1 = view.findViewById(R.id.jmc_text1);
        pmc_tx1 = view.findViewById(R.id.pmc_tx1);
        pmc_tx2 = view.findViewById(R.id.pmc_tx2);
        pmc_tx3 = view.findViewById(R.id.pmc_tx3);
        pmc_tx4 = view.findViewById(R.id.pmc_tx4);
        pmc_tx5 = view.findViewById(R.id.pmc_tx5);
        pmc_tx6 = view.findViewById(R.id.pmc_tx6);
        pmc_tx7 = view.findViewById(R.id.pmc_tx7);
        pmc_tx8 = view.findViewById(R.id.pmc_tx8);
        pmc_tx9 = view.findViewById(R.id.pmc_tx9);
        pmc_tx10 = view.findViewById(R.id.pmc_tx10);
        pmc_tx11 = view.findViewById(R.id.pmc_tx11);
        pmc_tx12 = view.findViewById(R.id.pmc_tx12);
        pmc_tx13 = view.findViewById(R.id.pmc_tx13);
        pmc_tx14 = view.findViewById(R.id.pmc_tx14);
        image_view_acoustic_guitar = view.findViewById(R.id.image_view_acoustic_guitar);
        image_view_electric_guitar = view.findViewById(R.id.image_view_electric_guitar);
        image_view_electric_bass = view.findViewById(R.id.image_view_electric_bass);
        linear_layout_acoustic_guitar = view.findViewById(R.id.jmc_attatched_layout);
        linear_layout_eletric_guitar = view.findViewById(R.id.jxc_attatched_layout);
        linear_layout_eletric_bass = view.findViewById(R.id.jnc_attatched_layout);
        popular_course_course_fee_3 = view.findViewById(R.id.popular_course_course_fee_3);
        popular_course_course_fee_2 = view.findViewById(R.id.popular_course_course_fee_2);
        popular_course_course_fee_1 = view.findViewById(R.id.popular_course_course_fee_1);

    }
}
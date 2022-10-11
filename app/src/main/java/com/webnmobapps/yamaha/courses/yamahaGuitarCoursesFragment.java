package com.webnmobapps.yamaha.courses;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class yamahaGuitarCoursesFragment extends Fragment {

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    AppCompatTextView ygc_tx1,ygc_tx2,ygc_tx3,ygc_tx4,ygc_tx5,ygc_tx6,ygc_tx7,ygc_tx8,ygc_tx9,ygc_tx10
            ,ygc_tx11,ygc_tx12,ygc_tx13,ygc_tx14,ygc_tx15,ygc_tx16,ygc_tx17,ygc_tx18,ygc_tx19,ygc_tx20
            ,ygc_tx21,ygc_tx22,ygc_tx23,ygc_tx24,ygc_tx25,ygc_tx26,ygc_tx27,ygc_tx28,cd_text1,total_student_ygc
            ,total_student_ygc2,course_setting_ygc,course_setting_ygc2,course_setting_ygc3,lession_duration_ygc
            ,lession_duration_ygc2,course_material_ygc,course_material_ygc2,course_material_ygc3,fsfdfsdf;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_yamaha_guitar_courses, container, false);
        intis(view);


        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_extrabold);
         //   cd_text1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            ygc_tx1.setTypeface(typeface);
            ygc_tx2.setTypeface(typeface);
            ygc_tx4.setTypeface(typeface);
            ygc_tx15.setTypeface(typeface);
            ygc_tx16.setTypeface(typeface);
            ygc_tx17.setTypeface(typeface);
            ygc_tx18.setTypeface(typeface);
            ygc_tx19.setTypeface(typeface);
            ygc_tx20.setTypeface(typeface);
            ygc_tx21.setTypeface(typeface);
            ygc_tx22.setTypeface(typeface);
            ygc_tx23.setTypeface(typeface);
            ygc_tx24.setTypeface(typeface);
            ygc_tx25.setTypeface(typeface);
            ygc_tx26.setTypeface(typeface);
            fsfdfsdf.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            total_student_ygc.setTypeface(typeface);
            total_student_ygc2.setTypeface(typeface);
            course_setting_ygc.setTypeface(typeface);
            course_setting_ygc2.setTypeface(typeface);
            course_setting_ygc3.setTypeface(typeface);
            lession_duration_ygc.setTypeface(typeface);
            lession_duration_ygc2.setTypeface(typeface);
            course_material_ygc.setTypeface(typeface);
            course_material_ygc2.setTypeface(typeface);
            course_material_ygc3.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            ygc_tx3.setTypeface(typeface);
            ygc_tx5.setTypeface(typeface);
            ygc_tx6.setTypeface(typeface);
            ygc_tx7.setTypeface(typeface);
            ygc_tx8.setTypeface(typeface);
            ygc_tx9.setTypeface(typeface);
            ygc_tx10.setTypeface(typeface);
            ygc_tx11.setTypeface(typeface);
            ygc_tx12.setTypeface(typeface);
            ygc_tx13.setTypeface(typeface);
            ygc_tx14.setTypeface(typeface);
            ygc_tx27.setTypeface(typeface);
            ygc_tx28.setTypeface(typeface);



        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_extrabold);
           // cd_text1.setTypeface(typeface);



            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
          //  course_fee_button_anc.setTypeface(typeface);
            ygc_tx1.setTypeface(typeface);
            ygc_tx2.setTypeface(typeface);
            ygc_tx4.setTypeface(typeface);
            ygc_tx15.setTypeface(typeface);
            ygc_tx16.setTypeface(typeface);
            ygc_tx17.setTypeface(typeface);
            ygc_tx18.setTypeface(typeface);
            ygc_tx19.setTypeface(typeface);
            ygc_tx20.setTypeface(typeface);
            ygc_tx21.setTypeface(typeface);
            ygc_tx22.setTypeface(typeface);
            ygc_tx23.setTypeface(typeface);
            ygc_tx24.setTypeface(typeface);
            ygc_tx25.setTypeface(typeface);
            ygc_tx26.setTypeface(typeface);
            fsfdfsdf.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            total_student_ygc.setTypeface(typeface);
            total_student_ygc2.setTypeface(typeface);
            course_setting_ygc.setTypeface(typeface);
            course_setting_ygc2.setTypeface(typeface);
            course_setting_ygc3.setTypeface(typeface);
            lession_duration_ygc.setTypeface(typeface);
            lession_duration_ygc2.setTypeface(typeface);
            course_material_ygc.setTypeface(typeface);
            course_material_ygc2.setTypeface(typeface);
            course_material_ygc3.setTypeface(typeface);




            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
           // text2_beside_image_jnc.setTypeface(typeface);
            ygc_tx3.setTypeface(typeface);
            ygc_tx5.setTypeface(typeface);
            ygc_tx6.setTypeface(typeface);
            ygc_tx7.setTypeface(typeface);
            ygc_tx8.setTypeface(typeface);
            ygc_tx9.setTypeface(typeface);
            ygc_tx10.setTypeface(typeface);
            ygc_tx11.setTypeface(typeface);
            ygc_tx12.setTypeface(typeface);
            ygc_tx13.setTypeface(typeface);
            ygc_tx14.setTypeface(typeface);
            ygc_tx27.setTypeface(typeface);
            ygc_tx28.setTypeface(typeface);


        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }



    return view;

    }

    private void intis(View view) {

        fsfdfsdf = view.findViewById(R.id.fsfdfsdf);
        total_student_ygc = view.findViewById(R.id.total_student_ygc);
        total_student_ygc2 = view.findViewById(R.id.total_student_ygc2);
        course_setting_ygc = view.findViewById(R.id.course_setting_ygc);
        course_setting_ygc2 = view.findViewById(R.id.course_setting_ygc2);
        course_setting_ygc3 = view.findViewById(R.id.course_setting_ygc3);
        lession_duration_ygc = view.findViewById(R.id.lession_duration_ygc);
        lession_duration_ygc2 = view.findViewById(R.id.lession_duration_ygc2);
        course_material_ygc = view.findViewById(R.id.course_material_ygc);
        course_material_ygc2 = view.findViewById(R.id.course_material_ygc2);
        course_material_ygc3 = view.findViewById(R.id.course_material_ygc3);
        cd_text1 = view.findViewById(R.id.cd_text1);
        ygc_tx28 = view.findViewById(R.id.ygc_tx28);
        ygc_tx1 = view.findViewById(R.id.ygc_tx1);
        ygc_tx2 = view.findViewById(R.id.ygc_tx2);
        ygc_tx3 = view.findViewById(R.id.ygc_tx3);
        ygc_tx4 = view.findViewById(R.id.ygc_tx4);
        ygc_tx5 = view.findViewById(R.id.ygc_tx5);
        ygc_tx6 = view.findViewById(R.id.ygc_tx6);
        ygc_tx7 = view.findViewById(R.id.ygc_tx7);
        ygc_tx8 = view.findViewById(R.id.ygc_tx8);
        ygc_tx9 = view.findViewById(R.id.ygc_tx9);
        ygc_tx10 = view.findViewById(R.id.ygc_tx10);
        ygc_tx11 = view.findViewById(R.id.ygc_tx11);
        ygc_tx12 = view.findViewById(R.id.ygc_tx12);
        ygc_tx13 = view.findViewById(R.id.ygc_tx13);
        ygc_tx14 = view.findViewById(R.id.ygc_tx14);
        ygc_tx15 = view.findViewById(R.id.ygc_tx15);
        ygc_tx16 = view.findViewById(R.id.ygc_tx16);
        ygc_tx17 = view.findViewById(R.id.ygc_tx17);
        ygc_tx18 = view.findViewById(R.id.ygc_tx18);
        ygc_tx19 = view.findViewById(R.id.ygc_tx19);
        ygc_tx20 = view.findViewById(R.id.ygc_tx20);
        ygc_tx21 = view.findViewById(R.id.ygc_tx21);
        ygc_tx22 = view.findViewById(R.id.ygc_tx22);
        ygc_tx23 = view.findViewById(R.id.ygc_tx23);
        ygc_tx24 = view.findViewById(R.id.ygc_tx24);
        ygc_tx25 = view.findViewById(R.id.ygc_tx25);
        ygc_tx26 = view.findViewById(R.id.ygc_tx26);
        ygc_tx27 = view.findViewById(R.id.ygc_tx27);
    }
}
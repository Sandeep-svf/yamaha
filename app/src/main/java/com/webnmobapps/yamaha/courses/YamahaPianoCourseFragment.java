package com.webnmobapps.yamaha.courses;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
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
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;
import com.webnmobapps.yamaha.utility.StaticKey;


public class YamahaPianoCourseFragment extends Fragment {
    AppCompatImageView piano_course_imag_1,piano_course_imag_2;
    AppCompatButton yamaha_piano_button_jxc;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    AppCompatTextView ypc_tx1,ypc_tx2,ypc_tx3,ypc_tx4,ypc_tx5,ypc_tx6,ypc_tx7,ypc_tx8,ypc_tx9,ypc_tx10,ypc_tx11
            ,ypc_tx12,ypc_tx13,ypc_tx14,ypc_tx15,ypc_tx16,ypc_tx17,ypc_tx18,ypc_tx19,ypc_tx20,ypc_tx21
            ,text_1_grade,fsfdfsdf
            ,cd_text1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_yamaha_piano_course, container, false);
        intis(view);




        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_extrabold);



            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
         //   course_fee_button_anc.setTypeface(typeface);
            ypc_tx1.setTypeface(typeface);
            ypc_tx2.setTypeface(typeface);
            text_1_grade.setTypeface(typeface);
            ypc_tx5.setTypeface(typeface);
            ypc_tx6.setTypeface(typeface);
            fsfdfsdf.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            ypc_tx9.setTypeface(typeface);
            ypc_tx10.setTypeface(typeface);
            ypc_tx11.setTypeface(typeface);
            ypc_tx12.setTypeface(typeface);
            ypc_tx13.setTypeface(typeface);
            ypc_tx14.setTypeface(typeface);
            ypc_tx15.setTypeface(typeface);
            ypc_tx16.setTypeface(typeface);
            ypc_tx17.setTypeface(typeface);
            ypc_tx18.setTypeface(typeface);
            ypc_tx19.setTypeface(typeface);
            ypc_tx20.setTypeface(typeface);
            ypc_tx21.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            ypc_tx3.setTypeface(typeface);
            ypc_tx4.setTypeface(typeface);
            ypc_tx7.setTypeface(typeface);
            ypc_tx8.setTypeface(typeface);




        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_extrabold);
         //   cd_text1.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
         //   course_fee_button_anc.setTypeface(typeface);
            ypc_tx1.setTypeface(typeface);
            ypc_tx2.setTypeface(typeface);
            text_1_grade.setTypeface(typeface);
            ypc_tx5.setTypeface(typeface);
            ypc_tx6.setTypeface(typeface);
            fsfdfsdf.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            ypc_tx9.setTypeface(typeface);
            ypc_tx10.setTypeface(typeface);
            ypc_tx11.setTypeface(typeface);
            ypc_tx12.setTypeface(typeface);
            ypc_tx13.setTypeface(typeface);
            ypc_tx14.setTypeface(typeface);
            ypc_tx15.setTypeface(typeface);
            ypc_tx16.setTypeface(typeface);
            ypc_tx17.setTypeface(typeface);
            ypc_tx18.setTypeface(typeface);
            ypc_tx19.setTypeface(typeface);
            ypc_tx20.setTypeface(typeface);
            ypc_tx21.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
         //   text2_beside_image_jnc.setTypeface(typeface);
            ypc_tx3.setTypeface(typeface);
            ypc_tx4.setTypeface(typeface);
            ypc_tx7.setTypeface(typeface);
            ypc_tx8.setTypeface(typeface);


        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }



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


        return view;
    }

    private void intis(View view) {

        piano_course_imag_1 = view.findViewById(R.id.piano_course_imag_1);
        piano_course_imag_2 = view.findViewById(R.id.piano_course_imag_2);
        yamaha_piano_button_jxc = view.findViewById(R.id.yamaha_piano_button_jxc);
        ypc_tx1 = view.findViewById(R.id.ypc_tx1);
        ypc_tx2 = view.findViewById(R.id.ypc_tx2);
        ypc_tx3 = view.findViewById(R.id.ypc_tx3);
        ypc_tx4 = view.findViewById(R.id.ypc_tx4);
        ypc_tx5 = view.findViewById(R.id.ypc_tx5);
        ypc_tx6 = view.findViewById(R.id.ypc_tx6);
        ypc_tx7= view.findViewById(R.id.ypc_tx7);
        ypc_tx8 = view.findViewById(R.id.ypc_tx8);
        ypc_tx9 = view.findViewById(R.id.ypc_tx9);
        ypc_tx10 = view.findViewById(R.id.ypc_tx10);
        ypc_tx11 = view.findViewById(R.id.ypc_tx11);
        ypc_tx12 = view.findViewById(R.id.ypc_tx12);
        ypc_tx13 = view.findViewById(R.id.ypc_tx13);
        ypc_tx14 = view.findViewById(R.id.ypc_tx14);
        ypc_tx15 = view.findViewById(R.id.ypc_tx15);
        ypc_tx16 = view.findViewById(R.id.ypc_tx16);
        ypc_tx17 = view.findViewById(R.id.ypc_tx17);
        ypc_tx18 = view.findViewById(R.id.ypc_tx18);
        ypc_tx19 = view.findViewById(R.id.ypc_tx19);
        ypc_tx20 = view.findViewById(R.id.ypc_tx20);
        ypc_tx21 = view.findViewById(R.id.ypc_tx21);
        text_1_grade = view.findViewById(R.id.text_1_grade);
        fsfdfsdf = view.findViewById(R.id.fsfdfsdf);
        cd_text1 = view.findViewById(R.id.cd_text1);

    }
}
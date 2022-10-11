package com.webnmobapps.yamaha.courses;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
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

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.feestructure.FeeStructureFragment;
import com.webnmobapps.yamaha.utility.StaticKey;


public class MusicFriendCourseFragment extends Fragment {

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    AppCompatButton music_friend_course_fee_1,music_friend_course_fee_2;
    AppCompatTextView mfc_tx1,mfc_tx2,mfc_tx3,mfc_tx4,mfc_tx5,cd_text1,mfc_tx6,mfc_tx7,mfc_tx8,mfc_tx9,mfc_tx10,mfc_tx11,mfc_tx12
            ,mfc_tx13,mfc_tx14,mfc_tx15,mfc_tx17,mfc_tx18,mfc_tx19,mfc_tx20,mfc_tx21,mfc_tx22,mfc_tx23,mfc_tx24,mfc_tx25,mfc_tx26,cd_text12,layout_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music_friend_course, container, false);
        intis(view);




        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_extrabold);
            //   cd_text1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            music_friend_course_fee_1.setTypeface(typeface);
            music_friend_course_fee_2.setTypeface(typeface);
            mfc_tx1.setTypeface(typeface);
            mfc_tx2.setTypeface(typeface);
            mfc_tx5.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            layout_5.setTypeface(typeface);
            mfc_tx6.setTypeface(typeface);
            mfc_tx7.setTypeface(typeface);
            mfc_tx8.setTypeface(typeface);
            mfc_tx9.setTypeface(typeface);
            mfc_tx10.setTypeface(typeface);
            mfc_tx11.setTypeface(typeface);
            mfc_tx12.setTypeface(typeface);
            mfc_tx13.setTypeface(typeface);
            mfc_tx14.setTypeface(typeface);
            mfc_tx15.setTypeface(typeface);
            mfc_tx17.setTypeface(typeface);
            mfc_tx18.setTypeface(typeface);
            mfc_tx20.setTypeface(typeface);
            mfc_tx21.setTypeface(typeface);
            mfc_tx22.setTypeface(typeface);
            mfc_tx23.setTypeface(typeface);
            mfc_tx24.setTypeface(typeface);
            mfc_tx25.setTypeface(typeface);
            mfc_tx26.setTypeface(typeface);
            mfc_tx19.setTypeface(typeface);
            cd_text12.setTypeface(typeface);




            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
           // ygc_tx3.setTypeface(typeface);
            mfc_tx3.setTypeface(typeface);
            mfc_tx4.setTypeface(typeface);




        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_extrabold);
            // cd_text1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            //  course_fee_button_anc.setTypeface(typeface);
            music_friend_course_fee_1.setTypeface(typeface);
            music_friend_course_fee_2.setTypeface(typeface);
            mfc_tx1.setTypeface(typeface);
            cd_text1.setTypeface(typeface);
            layout_5.setTypeface(typeface);
            mfc_tx2.setTypeface(typeface);
            mfc_tx5.setTypeface(typeface);
            mfc_tx6.setTypeface(typeface);
            mfc_tx7.setTypeface(typeface);
            mfc_tx8.setTypeface(typeface);
            mfc_tx9.setTypeface(typeface);
            mfc_tx10.setTypeface(typeface);
            mfc_tx11.setTypeface(typeface);
            mfc_tx12.setTypeface(typeface);
            mfc_tx13.setTypeface(typeface);
            mfc_tx14.setTypeface(typeface);
            mfc_tx15.setTypeface(typeface);
            mfc_tx17.setTypeface(typeface);
            mfc_tx18.setTypeface(typeface);
            mfc_tx20.setTypeface(typeface);
            mfc_tx21.setTypeface(typeface);
            mfc_tx22.setTypeface(typeface);
            mfc_tx23.setTypeface(typeface);
            mfc_tx24.setTypeface(typeface);
            mfc_tx25.setTypeface(typeface);
            mfc_tx26.setTypeface(typeface);
            mfc_tx19.setTypeface(typeface);
            cd_text12.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            // text2_beside_image_jnc.setTypeface(typeface);
            mfc_tx3.setTypeface(typeface);
            mfc_tx4.setTypeface(typeface);



        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }




        music_friend_course_fee_1.setOnClickListener(new View.OnClickListener() {
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

        music_friend_course_fee_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             /*   FeeStructureFragment fragment = new FeeStructureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/

                Intent intent = new Intent(getActivity(), FeeStructureFragment.class);
                startActivity(intent);

            }
        });


        return  view;
    }

    private void intis(View view) {


        layout_5 = view.findViewById(R.id.layout_5);
        mfc_tx1 = view.findViewById(R.id.mfc_tx1);
        mfc_tx2 = view.findViewById(R.id.mfc_tx2);
        mfc_tx3 = view.findViewById(R.id.mfc_tx3);
        mfc_tx4 = view.findViewById(R.id.mfc_tx4);
        mfc_tx5 = view.findViewById(R.id.mfc_tx5);
        mfc_tx6 = view.findViewById(R.id.mfc_tx6);
        mfc_tx7 = view.findViewById(R.id.mfc_tx7);
        mfc_tx8 = view.findViewById(R.id.mfc_tx8);
        mfc_tx9 = view.findViewById(R.id.mfc_tx9);
        mfc_tx10 = view.findViewById(R.id.mfc_tx10);
        mfc_tx11 = view.findViewById(R.id.mfc_tx11);
        mfc_tx12 = view.findViewById(R.id.mfc_tx12);
        mfc_tx13 = view.findViewById(R.id.mfc_tx13);
        mfc_tx14 = view.findViewById(R.id.mfc_tx14);
        mfc_tx15 = view.findViewById(R.id.mfc_tx15);
        mfc_tx17 = view.findViewById(R.id.mfc_tx17);
        mfc_tx18 = view.findViewById(R.id.mfc_tx18);
        mfc_tx19 = view.findViewById(R.id.mfc_tx19);
        mfc_tx20 = view.findViewById(R.id.mfc_tx20);
        mfc_tx21 = view.findViewById(R.id.mfc_tx21);
        mfc_tx22 = view.findViewById(R.id.mfc_tx22);
        mfc_tx23 = view.findViewById(R.id.mfc_tx23);
        mfc_tx24 = view.findViewById(R.id.mfc_tx24);
        mfc_tx25 = view.findViewById(R.id.mfc_tx25);
        mfc_tx26 = view.findViewById(R.id.mfc_tx26);
        cd_text12 = view.findViewById(R.id.cd_text12);
        cd_text1 = view.findViewById(R.id.cd_text1);


        music_friend_course_fee_1 = view.findViewById(R.id.music_friend_course_fee_1);
        music_friend_course_fee_2 = view.findViewById(R.id.music_friend_course_fee_2);
        mfc_tx1 = view.findViewById(R.id.mfc_tx1);
    }
}
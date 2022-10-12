package com.webnmobapps.yamaha.feestructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;

import com.webnmobapps.yamaha.utility.StaticKey;

public class FeeStructureFragment extends AppCompatActivity {
    LinearLayoutCompat  back;
    AppCompatTextView fs_text1, fs_text2,fs_text3,fs_text4,fs_text5,fs_text6,fs_text7,fs_text8,fs_text9,fs_text10,fs_text11,fs_text12,fs_text13,fs_text14
            ,fs_text15,fs_text16,fs_text17,fs_text18,fs_text19,fs_text20,fs_text21,fs_text22,fs_text23,fs_text24,fs_text25,fs_text26,fs_text27
            ,fs_text28,fs_text29,fs_text30,fs_text31,fs_text32,fs_text33;

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    private Typeface typeface;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_structure_fragment);
       
        intis();



        sharedPreferences= getApplicationContext().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(FeeStructureFragment.this, R.font.daxcompact_bold);
            fs_text1.setTypeface(typeface);
            fs_text2.setTypeface(typeface);
            fs_text3.setTypeface(typeface);
            fs_text4.setTypeface(typeface);
            fs_text5.setTypeface(typeface);
            fs_text6.setTypeface(typeface);
            fs_text7.setTypeface(typeface);
            fs_text11.setTypeface(typeface);
            fs_text12.setTypeface(typeface);
            fs_text13.setTypeface(typeface);
            fs_text15.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(FeeStructureFragment.this, R.font.daxcompact_medium);
            fs_text8.setTypeface(typeface);
            fs_text9.setTypeface(typeface);
            fs_text10.setTypeface(typeface);
            fs_text14.setTypeface(typeface);
            fs_text16.setTypeface(typeface);
            fs_text17.setTypeface(typeface);
            fs_text18.setTypeface(typeface);
            fs_text19.setTypeface(typeface);
            fs_text20.setTypeface(typeface);
            fs_text21.setTypeface(typeface);
            fs_text22.setTypeface(typeface);
            fs_text23.setTypeface(typeface);
            fs_text24.setTypeface(typeface);
            fs_text25.setTypeface(typeface);
            fs_text26.setTypeface(typeface);
            fs_text27.setTypeface(typeface);
            fs_text28.setTypeface(typeface);
            fs_text29.setTypeface(typeface);
            fs_text30.setTypeface(typeface);
            fs_text31.setTypeface(typeface);
            fs_text32.setTypeface(typeface);
            fs_text33.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(FeeStructureFragment.this, R.font.cairo_bold);
            fs_text1.setTypeface(typeface);
            fs_text2.setTypeface(typeface);
            fs_text3.setTypeface(typeface);
            fs_text4.setTypeface(typeface);
            fs_text5.setTypeface(typeface);
            fs_text6.setTypeface(typeface);
            fs_text7.setTypeface(typeface);
            fs_text11.setTypeface(typeface);
            fs_text12.setTypeface(typeface);
            fs_text13.setTypeface(typeface);
            fs_text15.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(FeeStructureFragment.this, R.font.cairo_medium);
            fs_text8.setTypeface(typeface);
            fs_text9.setTypeface(typeface);
            fs_text10.setTypeface(typeface);
            fs_text14.setTypeface(typeface);
            fs_text16.setTypeface(typeface);
            fs_text17.setTypeface(typeface);
            fs_text18.setTypeface(typeface);
            fs_text19.setTypeface(typeface);
            fs_text20.setTypeface(typeface);
            fs_text21.setTypeface(typeface);
            fs_text22.setTypeface(typeface);
            fs_text23.setTypeface(typeface);
            fs_text24.setTypeface(typeface);
            fs_text25.setTypeface(typeface);
            fs_text26.setTypeface(typeface);
            fs_text27.setTypeface(typeface);
            fs_text28.setTypeface(typeface);
            fs_text29.setTypeface(typeface);
            fs_text30.setTypeface(typeface);
            fs_text31.setTypeface(typeface);
            fs_text32.setTypeface(typeface);
            fs_text33.setTypeface(typeface);

        }else{
            Toast.makeText(FeeStructureFragment.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void intis() {
        fs_text33 = findViewById(R.id.fs_text33);
        fs_text32 = findViewById(R.id.fs_text32);
        back = findViewById(R.id.back);
        fs_text1 = findViewById(R.id.fs_text1);
        fs_text2 = findViewById(R.id.fs_text2);
        fs_text3 = findViewById(R.id.fs_text3);
        fs_text4 = findViewById(R.id.fs_text4);
        fs_text5 = findViewById(R.id.fs_text5);
        fs_text6 = findViewById(R.id.fs_text6);
        fs_text7 = findViewById(R.id.fs_text7);
        fs_text8 = findViewById(R.id.fs_text8);
        fs_text9 = findViewById(R.id.fs_text9);
        fs_text10 = findViewById(R.id.fs_text10);
        fs_text11 = findViewById(R.id.fs_text11);
        fs_text12 = findViewById(R.id.fs_text12);
        fs_text13 = findViewById(R.id.fs_text13);
        fs_text14 = findViewById(R.id.fs_text14);
        fs_text15 = findViewById(R.id.fs_text15);
        fs_text16 = findViewById(R.id.fs_text16);
        fs_text17 = findViewById(R.id.fs_text17);
        fs_text18 = findViewById(R.id.fs_text18);
        fs_text19 = findViewById(R.id.fs_text19);
        fs_text20 = findViewById(R.id.fs_text20);
        fs_text21 = findViewById(R.id.fs_text21);
        fs_text22 = findViewById(R.id.fs_text22);
        fs_text23 = findViewById(R.id.fs_text23);
        fs_text24 = findViewById(R.id.fs_text24);
        fs_text25 = findViewById(R.id.fs_text25);
        fs_text26 = findViewById(R.id.fs_text26);
        fs_text27 = findViewById(R.id.fs_text27);
        fs_text28 = findViewById(R.id.fs_text28);
        fs_text29 = findViewById(R.id.fs_text29);
        fs_text30 = findViewById(R.id.fs_text30);
        fs_text31 = findViewById(R.id.fs_text31);
    }
}
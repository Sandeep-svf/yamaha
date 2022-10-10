package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class LoginActivity extends AppCompatActivity {
    AppCompatImageView sub_logo_layout, logo_layout;
    AppCompatButton login_button, signup_button;
    AppCompatTextView skip_textview_layout;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    private AppCompatTextView logo_description;
    private Typeface typeface;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        intis();

        sharedPreferences= getApplicationContext().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(LoginActivity.this, R.font.daxcompact_bold);
            login_button.setTypeface(typeface);
            signup_button.setTypeface(typeface);
            logo_description.setTypeface(typeface);
            typeface = ResourcesCompat.getFont(LoginActivity.this, R.font.daxcompact_medium);
            skip_textview_layout.setTypeface(typeface);

        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(LoginActivity.this, R.font.cairo_bold);
            login_button.setTypeface(typeface);
            signup_button.setTypeface(typeface);
            logo_description.setTypeface(typeface);
            typeface = ResourcesCompat.getFont(LoginActivity.this, R.font.cairo_medium);
            skip_textview_layout.setTypeface(typeface);

        }else{
            Toast.makeText(LoginActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }


        Glide.with(LoginActivity.this).load(R.drawable.logo).placeholder(R.drawable.ic_launcher_background).into(logo_layout);
        Glide.with(LoginActivity.this).load(R.drawable.sub_logo).placeholder(R.drawable.ic_launcher_background).into(sub_logo_layout);

      login_button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {



              Intent intent = new Intent(LoginActivity.this, Login2Activity.class);
              startActivity(intent);
          }
      });

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        skip_textview_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(LoginActivity.this, "You have been directed to Home page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void intis() {
        sub_logo_layout = findViewById(R.id.sub_logo_layout);
        logo_layout = findViewById(R.id.logo_layout);
        signup_button = findViewById(R.id.signup_button);
        login_button = findViewById(R.id.login_button);
        skip_textview_layout = findViewById(R.id.skip_textview_layout);
        logo_description = findViewById(R.id.logo_description);
    }
}
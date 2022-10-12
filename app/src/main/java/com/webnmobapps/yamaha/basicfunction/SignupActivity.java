package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class SignupActivity extends AppCompatActivity {

    AppCompatTextView back_textview_layout,sign_in_layout,su_text1,su_text2;
    AppCompatEditText su_firstname,su_lastname,su_email,su_password,su_c_password;
    AppCompatButton signup_button;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        intis();



        sharedPreferences= getApplicationContext().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(SignupActivity.this, R.font.daxcompact_bold);
            su_text1.setTypeface(typeface);
            signup_button.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(SignupActivity.this, R.font.daxcompact_medium);
            su_text2.setTypeface(typeface);
            su_firstname.setTypeface(typeface);
            su_lastname.setTypeface(typeface);
            su_email.setTypeface(typeface);
            su_password.setTypeface(typeface);
            su_c_password.setTypeface(typeface);
            back_textview_layout.setTypeface(typeface);
            sign_in_layout.setTypeface(typeface);

        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(SignupActivity.this, R.font.cairo_bold);
            su_text1.setTypeface(typeface);
            signup_button.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(SignupActivity.this, R.font.cairo_medium);
            su_text2.setTypeface(typeface);
            su_firstname.setTypeface(typeface);
            su_lastname.setTypeface(typeface);
            su_email.setTypeface(typeface);
            su_password.setTypeface(typeface);
            su_c_password.setTypeface(typeface);
            back_textview_layout.setTypeface(typeface);
            sign_in_layout.setTypeface(typeface);

        }else{
            Toast.makeText(SignupActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }
        
        

        back_textview_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, Login2Activity.class);
                startActivity(intent); 
            }
        });
        
        sign_in_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, Login2Activity.class);
                startActivity(intent);
            }
        });

    }

    private void intis() {
        
        su_text1 = findViewById(R.id.su_text1);
        su_text2 = findViewById(R.id.su_text2);
        su_firstname = findViewById(R.id.su_firstname);
        su_lastname = findViewById(R.id.su_lastname);
        su_email = findViewById(R.id.su_email);
        su_password = findViewById(R.id.su_password);
        su_c_password = findViewById(R.id.su_c_password);
        signup_button = findViewById(R.id.signup_button);
        back_textview_layout = findViewById(R.id.back_textview_layout);
        sign_in_layout = findViewById(R.id.sign_in_layout);
    }
}
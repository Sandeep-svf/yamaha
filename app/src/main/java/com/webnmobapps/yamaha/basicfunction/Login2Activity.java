package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class Login2Activity extends AppCompatActivity {


    AppCompatButton login2_button;
    Typeface typeface;
    AppCompatTextView back_textview_layout,login_text,remamber_me_text,forgot_password_text,do_not_have_account;
    AppCompatEditText email_edit_text_layout, password_edit_text_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        intis();
        Log.e("check_language","Sesssion 1" + "STARTED");

        if(StaticKey.languageEn.equals("ar")){
            Log.e("check_language","Sesssion 1" + "en");
            typeface = ResourcesCompat.getFont(Login2Activity.this, R.font.daxcompact_bold);
            back_textview_layout.setTypeface(typeface);
            forgot_password_text.setTypeface(typeface);
            remamber_me_text.setTypeface(typeface);
            login_text.setTypeface(typeface);
            password_edit_text_layout.setTypeface(typeface);
            email_edit_text_layout.setTypeface(typeface);
            login2_button.setTypeface(typeface);
            do_not_have_account.setTypeface(typeface);
        }else if(StaticKey.languageAr.equals("ar")){
            typeface = ResourcesCompat.getFont(Login2Activity.this, R.font.cairo_bold);
            back_textview_layout.setTypeface(typeface);
            forgot_password_text.setTypeface(typeface);
            remamber_me_text.setTypeface(typeface);
            login_text.setTypeface(typeface);
            password_edit_text_layout.setTypeface(typeface);
            email_edit_text_layout.setTypeface(typeface);
            login2_button.setTypeface(typeface);
            do_not_have_account.setTypeface(typeface);
            Log.e("check_language","Sesssion 1" + "ar");
        }else{
            Toast.makeText(Login2Activity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }



        login2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void intis() {
        forgot_password_text = findViewById(R.id.forgot_password_text);
        remamber_me_text = findViewById(R.id.remamber_me_text);
        login_text = findViewById(R.id.login_text);
        password_edit_text_layout = findViewById(R.id.password_edit_text_layout);
        email_edit_text_layout = findViewById(R.id.email_edit_text_layout);
        login2_button = findViewById(R.id.login2_button);
        back_textview_layout = findViewById(R.id.back_textview_layout);
        do_not_have_account = findViewById(R.id.do_not_have_account);
    }
}
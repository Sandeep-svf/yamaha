package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;

public class LoginActivity extends AppCompatActivity {
    AppCompatImageView sub_logo_layout, logo_layout;
    AppCompatButton login_button, signup_button;
    AppCompatTextView skip_textview_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        intis();

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
                Toast.makeText(LoginActivity.this, "You have been directed to Home page.", Toast.LENGTH_SHORT).show();
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
    }
}
package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;

public class Login2Activity extends AppCompatActivity {


    AppCompatButton login2_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        intis();

        login2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void intis() {
        login2_button = findViewById(R.id.login2_button);
    }
}
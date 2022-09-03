package com.webnmobapps.yamaha.basicfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

import com.webnmobapps.yamaha.R;

public class SignupActivity extends AppCompatActivity {

    AppCompatTextView back_textview_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        intis();

        back_textview_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void intis() {
        back_textview_layout = findViewById(R.id.back_textview_layout);
    }
}
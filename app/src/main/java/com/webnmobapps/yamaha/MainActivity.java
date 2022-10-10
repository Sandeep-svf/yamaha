package com.webnmobapps.yamaha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import com.webnmobapps.yamaha.booking.BookingFragment;
import com.webnmobapps.yamaha.courses.CourseFragment;
import com.webnmobapps.yamaha.events.EventFragment;
import com.webnmobapps.yamaha.more.MoreFragment;
import com.webnmobapps.yamaha.profile.ProfileFragment;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    LinearLayoutCompat home_layout,booking_layout,event_layout,profile_layout,more_layout;
    AppCompatImageView home_image,booking_image,event_image,profile_image,more_image;
    ConstraintLayout fragment_contaner;
    private AppCompatTextView home_text, book_text,event_text,profile_text,more_text;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intis();
        //language();


        sharedPreferences= getApplicationContext().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(MainActivity.this, R.font.daxcompact_bold);
            home_text.setTypeface(typeface);
            book_text.setTypeface(typeface);
            event_text.setTypeface(typeface);
            profile_text.setTypeface(typeface);
            more_text.setTypeface(typeface);

        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(MainActivity.this, R.font.cairo_bold);
            home_text.setTypeface(typeface);
            book_text.setTypeface(typeface);
            event_text.setTypeface(typeface);
            profile_text.setTypeface(typeface);
            more_text.setTypeface(typeface);

        }else{
            Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }




        // default setting for bottom menu
        home_image.setImageResource(R.drawable.home_color);
        booking_image.setImageResource(R.drawable.booking);
        event_image.setImageResource(R.drawable.event);
        profile_image.setImageResource(R.drawable.profile);
        more_image.setImageResource(R.drawable.more);

  

        // loading default fragment ...........
        CourseFragment pageFragment = new CourseFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        home_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_image.setImageResource(R.drawable.home_color);
                booking_image.setImageResource(R.drawable.booking);
                event_image.setImageResource(R.drawable.event);
                profile_image.setImageResource(R.drawable.profile);
                more_image.setImageResource(R.drawable.more);


                CourseFragment pageFragment = new CourseFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
               // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        booking_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_image.setImageResource(R.drawable.home);
                booking_image.setImageResource(R.drawable.book_color);
                event_image.setImageResource(R.drawable.event);
                profile_image.setImageResource(R.drawable.profile);
                more_image.setImageResource(R.drawable.more);

                BookingFragment pageFragment = new BookingFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        event_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_image.setImageResource(R.drawable.home);
                booking_image.setImageResource(R.drawable.booking);
                event_image.setImageResource(R.drawable.event_color);
                profile_image.setImageResource(R.drawable.profile);
                more_image.setImageResource(R.drawable.more);

                EventFragment pageFragment = new EventFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        profile_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_image.setImageResource(R.drawable.home);
                booking_image.setImageResource(R.drawable.booking);
                event_image.setImageResource(R.drawable.event);
                profile_image.setImageResource(R.drawable.profile_color);
                more_image.setImageResource(R.drawable.more);

                ProfileFragment pageFragment = new ProfileFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        more_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_image.setImageResource(R.drawable.home);
                booking_image.setImageResource(R.drawable.booking);
                event_image.setImageResource(R.drawable.event);
                profile_image.setImageResource(R.drawable.profile);
                more_image.setImageResource(R.drawable.more_color);

                MoreFragment pageFragment = new MoreFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


    }
    private void language() {

        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        MainActivity.this.getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());

    }
    private void intis() {

        more_text = findViewById(R.id.more_text);
        profile_text = findViewById(R.id.profile_text);
        event_text = findViewById(R.id.event_text);
        book_text = findViewById(R.id.book_text);
        home_text = findViewById(R.id.home_text);
        home_layout = findViewById(R.id.home_layout);
        booking_layout = findViewById(R.id.booking_layout);
        event_layout = findViewById(R.id.event_layout);
        profile_layout = findViewById(R.id.profile_layout);
        more_layout = findViewById(R.id.more_layout);
        home_image = findViewById(R.id.home_image);
        booking_image = findViewById(R.id.booking_image);
        event_image = findViewById(R.id.event_image);
        profile_image = findViewById(R.id.profile_image);
        more_image = findViewById(R.id.more_image);
        fragment_contaner = findViewById(R.id.fragment_contaner);
    }
}
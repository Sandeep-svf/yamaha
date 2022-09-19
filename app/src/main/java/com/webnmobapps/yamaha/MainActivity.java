package com.webnmobapps.yamaha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.webnmobapps.yamaha.booking.BookingFragment;
import com.webnmobapps.yamaha.courses.CourseFragment;
import com.webnmobapps.yamaha.events.EventFragment;
import com.webnmobapps.yamaha.more.MoreFragment;
import com.webnmobapps.yamaha.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    LinearLayoutCompat home_layout,booking_layout,event_layout,profile_layout,more_layout;
    AppCompatImageView home_image,booking_image,event_image,profile_image,more_image;
    ConstraintLayout fragment_contaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intis();

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

    private void intis() {
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
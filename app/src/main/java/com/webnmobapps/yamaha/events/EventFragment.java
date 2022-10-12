package com.webnmobapps.yamaha.events;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.ArrayList;
import java.util.List;


public class EventFragment extends Fragment {

    ConstraintLayout container_event;
    AppCompatImageView book_imag_1, book_imag_2;
    public static TabLayout tabLayout;
    public static ViewPager viewPager;


    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_event, container, false);
        inits(view);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        setupViewPager(viewPager,adapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabtitle();


        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
          //  book_tx1.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
          //  book_tx2.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
          //  book_tx1.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
          //  book_tx2.setTypeface(typeface);



        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }



        Glide.with(getActivity()).load(R.drawable.music_friend_course_image).placeholder(R.drawable.ic_launcher_background).into(book_imag_1);
        Glide.with(getActivity()).load(R.drawable.event_banner).placeholder(R.drawable.ic_launcher_background).into(book_imag_2);

        return  view;
    }
    private void inits(View view) {

        book_imag_1 = view.findViewById(R.id.event_imag_1);
        book_imag_2 = view.findViewById(R.id.event_imag_2);
        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tabs);
        container_event = view.findViewById(R.id.container_event);

    }
    private void setupTabtitle() {


        tabLayout.getTabAt(0).setText(getResources().getString(R.string.upcoming));

        tabLayout.getTabAt(1).setText(getResources().getString(R.string.previous));


    }
    public static void setupViewPager(ViewPager viewPager, ViewPagerAdapter adapter)
    {
        {
            adapter.addFragment(new UpcomingEventFragment());
            adapter.addFragment(new PreviousEventFragment());

        }

        viewPager.setAdapter(adapter);
    }
    static class ViewPagerAdapter extends FragmentPagerAdapter
    {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);


        }


    }
}
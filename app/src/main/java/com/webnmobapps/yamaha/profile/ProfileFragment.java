package com.webnmobapps.yamaha.profile;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.ExpandableListViewAdapter;
import com.webnmobapps.yamaha.basicfunction.Login2Activity;
import com.webnmobapps.yamaha.basicfunction.LoginActivity;
import com.webnmobapps.yamaha.basicfunction.SplashActivity;
import com.webnmobapps.yamaha.courses.PopularMusicCourseFragment;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;


public class ProfileFragment extends Fragment {

    private ExpandableListView expandableListView;
    private ExpandableListViewAdapter expandableListViewAdapter;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;
    private ConstraintLayout schedule_layout;
    private CardView logout_cardview,setting_cardview;
    private AppCompatTextView account_information_layout,change_password_layout,language_layout,city_layout;
    private boolean settingsFlag = true;
    private String languageFlag = StaticKey.languageEn;
    SharedPreferences sharedPreferences;
    private AppCompatTextView schedule_text,payment_text,setting_text,lagout_text,user_name,user_email;
    private String language = StaticKey.languageEn;
    Typeface typeface;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);


        // initializing the views
        initViews(view);

        //language(getActivity());


        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            user_name.setTypeface(typeface);
            schedule_text.setTypeface(typeface);
            payment_text.setTypeface(typeface);
            setting_text.setTypeface(typeface);
            city_layout.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            user_email.setTypeface(typeface);
            account_information_layout.setTypeface(typeface);
            change_password_layout.setTypeface(typeface);
            language_layout.setTypeface(typeface);
            user_email.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            user_name.setTypeface(typeface);
            schedule_text.setTypeface(typeface);
            payment_text.setTypeface(typeface);
            setting_text.setTypeface(typeface);
            lagout_text.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            user_email.setTypeface(typeface);
            account_information_layout.setTypeface(typeface);
            change_password_layout.setTypeface(typeface);
            language_layout.setTypeface(typeface);
            user_email.setTypeface(typeface);




        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }




        setting_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (settingsFlag) {
                    account_information_layout.setVisibility(View.VISIBLE);
                    change_password_layout.setVisibility(View.VISIBLE);
                    language_layout.setVisibility(View.VISIBLE);
                    city_layout.setVisibility(View.VISIBLE);
                    settingsFlag = false;
                } else {
                    account_information_layout.setVisibility(View.GONE);
                    change_password_layout.setVisibility(View.GONE);
                    language_layout.setVisibility(View.GONE);
                    city_layout.setVisibility(View.GONE);
                    settingsFlag = true;
                }
            }
        });

        account_information_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert_dialog(0,getActivity());
            }
        });

        change_password_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert_dialog(1,getActivity());
            }
        });

        language_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert_dialog(2,getActivity());
            }
        });

        city_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert_dialog(3,getActivity());
            }
        });

        logout_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Login2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // To clean up all activities
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.putExtra("finish", true);
                startActivity(intent);

                Toast.makeText(getActivity(), "User logout successfully", Toast.LENGTH_SHORT).show();

            }
        });

        schedule_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScheduleFragment fragment = new ScheduleFragment();
                FragmentManager fragmentManager = (getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });





        // initializing the listeners
        initListeners();

        // initializing the objects
        initObjects();

        // preparing list data
        initListData();


        return  view;
    }

    private void language(FragmentActivity getActivity2) {

        Locale locale = new Locale("ar");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getActivity().getBaseContext().getResources().updateConfiguration(config,getActivity().getBaseContext().getResources().getDisplayMetrics());

    }


    /**
     * method to initialize the views
     */
    private void initViews(View view) {

        schedule_text = view.findViewById(R.id.schedule_text);
        payment_text = view.findViewById(R.id.payment_text);
        setting_text = view.findViewById(R.id.setting_text);
        lagout_text = view.findViewById(R.id.lagout_text);
        user_name = view.findViewById(R.id.user_name);
        user_email = view.findViewById(R.id.user_email);
        expandableListView = view.findViewById(R.id.expandableListView);
        schedule_layout = view.findViewById(R.id.schedule_layout);
        logout_cardview = view.findViewById(R.id.logout_cardview);
        setting_cardview = view.findViewById(R.id.setting_cardview);
        account_information_layout = view.findViewById(R.id.account_information_layout);
        change_password_layout = view.findViewById(R.id.change_password_layout);
        language_layout = view.findViewById(R.id.language_layout);
        city_layout = view.findViewById(R.id.city_layout);

    }

    /**
     * method to initialize the listeners
     */
    private void initListeners() {




       /* expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                ImageView groupIndicator = (ImageView) clickedView.findViewById(R.id.help_group_indicator);
                if (parent.isGroupExpanded(groupPosition)) {
                    parent.collapseGroup(groupPosition);
                    groupIndicator.setImageResource(R.drawable.down_icon);
                } else {
                    parent.expandGroup(groupPosition);
                    groupIndicator.setImageResource(R.drawable.up_icon);
                }
                return true;
            }
        });*/


        // ExpandableListView on child click listener
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                Log.e("check_position", String.valueOf(childPosition)+"0");

              alert_dialog(childPosition, getActivity());
                return false;
            }



        });

        // ExpandableListView Group expanded listener
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

                Log.e("check_position", String.valueOf(groupPosition)+"1");
                Toast.makeText(getActivity(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // ExpandableListView Group collapsed listener
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

                Log.e("check_position", String.valueOf(groupPosition)+"2");

                Toast.makeText(getActivity(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void alert_dialog(int childPosition, Context context) {
        // Dialoogs...
        Dialog dialogs;


        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View alertLayout = null;


        if(childPosition==0){
             alertLayout = inflater.inflate(R.layout.account_information, null);

             final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);
             final AppCompatTextView abd_text1 = alertLayout.findViewById(R.id.abd_text1);
             final AppCompatTextView adb_text2 = alertLayout.findViewById(R.id.adb_text2);
             final AppCompatTextView adb_text3 = alertLayout.findViewById(R.id.adb_text3);
             final AppCompatTextView adb_text4 = alertLayout.findViewById(R.id.adb_text4);
             final AppCompatTextView adb_text5 = alertLayout.findViewById(R.id.adb_text5);
             final AppCompatTextView adb_text6 = alertLayout.findViewById(R.id.adb_text6);
             final AppCompatTextView adb_text7 = alertLayout.findViewById(R.id.adb_text7);
             final AppCompatTextView adb_text8 = alertLayout.findViewById(R.id.adb_text8);



            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);



            Log.e("check_language","Sesssion 1" +"language is: "+ language);

            if(StaticKey.languageEn.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
                abd_text1.setTypeface(typeface);


                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
                adb_text2.setTypeface(typeface);
                adb_text3.setTypeface(typeface);
                adb_text4.setTypeface(typeface);
                adb_text5.setTypeface(typeface);
                adb_text6.setTypeface(typeface);
                adb_text7.setTypeface(typeface);
                adb_text8.setTypeface(typeface);


            }else if(StaticKey.languageAr.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
                abd_text1.setTypeface(typeface);


                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
                adb_text2.setTypeface(typeface);
                adb_text3.setTypeface(typeface);
                adb_text4.setTypeface(typeface);
                adb_text5.setTypeface(typeface);
                adb_text6.setTypeface(typeface);
                adb_text7.setTypeface(typeface);
                adb_text8.setTypeface(typeface);



            }else{
                Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
                Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
            }


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });



        }else if(childPosition==1){
             alertLayout = inflater.inflate(R.layout.change_password, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);
            final AppCompatTextView cp_text8 = alertLayout.findViewById(R.id.cp_text8);
            final AppCompatTextView cp_text7 = alertLayout.findViewById(R.id.cp_text7);
            final AppCompatTextView cp_text6 = alertLayout.findViewById(R.id.cp_text6);
            final AppCompatTextView cp_text5 = alertLayout.findViewById(R.id.cp_text5);
            final AppCompatEditText cp_text4 = alertLayout.findViewById(R.id.cp_text4);
            final AppCompatEditText cp_text3 = alertLayout.findViewById(R.id.cp_text3);
            final AppCompatEditText cp_text2 = alertLayout.findViewById(R.id.cp_text2);
            final AppCompatTextView cp_text1 = alertLayout.findViewById(R.id.cp_text1);


            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);

            Log.e("check_language","Sesssion 1" +"language is: "+ language);

            if(StaticKey.languageEn.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
                cp_text1.setTypeface(typeface);


                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
                cp_text2.setTypeface(typeface);
                cp_text3.setTypeface(typeface);
                cp_text4.setTypeface(typeface);
                cp_text5.setTypeface(typeface);
                cp_text6.setTypeface(typeface);
                cp_text7.setTypeface(typeface);
                cp_text8.setTypeface(typeface);



            }else if(StaticKey.languageAr.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
                cp_text1.setTypeface(typeface);


                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
                cp_text2.setTypeface(typeface);
                cp_text3.setTypeface(typeface);
                cp_text4.setTypeface(typeface);
                cp_text5.setTypeface(typeface);
                cp_text6.setTypeface(typeface);
                cp_text7.setTypeface(typeface);
                cp_text8.setTypeface(typeface);



            }else{
                Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
                Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
            }


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }else if(childPosition==2){
             alertLayout = inflater.inflate(R.layout.language, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);
            final AppCompatTextView english_layout = alertLayout.findViewById(R.id.english_layout);
            final AppCompatTextView arbic_layout = alertLayout.findViewById(R.id.arbic_layout);
            final AppCompatTextView save_layout = alertLayout.findViewById(R.id.save_layout);
            final AppCompatTextView l_text1 = alertLayout.findViewById(R.id.l_text1);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


             //   Log.e("check_language","Sesssion 1" +"language is: "+ language);

            if(StaticKey.languageEn.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
                l_text1.setTypeface(typeface);

                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
                save_layout.setTypeface(typeface);
                english_layout.setTypeface(typeface);
                arbic_layout.setTypeface(typeface);

            }else if(StaticKey.languageAr.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
                l_text1.setTypeface(typeface);



                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
                save_layout.setTypeface(typeface);
                english_layout.setTypeface(typeface);
                arbic_layout.setTypeface(typeface);




            }else{
                Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
                Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
            }




            arbic_layout.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    languageFlag = StaticKey.languageAr;
                    english_layout.setTextColor(R.color.light_black);
                    arbic_layout.setBackgroundResource(R.color.light_black);
                    arbic_layout.setTextColor(R.color.white);

                    english_layout.setBackgroundResource(R.color.white);
                }
            });

            english_layout.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    english_layout.setBackgroundResource(R.color.light_black);
                    arbic_layout.setBackgroundResource(R.color.white);
                    english_layout.setTextColor(R.color.white);

                    arbic_layout.setTextColor(R.color.light_black);
                    languageFlag = StaticKey.languageEn;

                }
            });

            save_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    sharedPreferences = getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("language", languageFlag);
                    editor.apply();

                    sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
                    String checkLanguage =sharedPreferences.getString("language","");

                    Log.e("test_language","checkLanguage: "+checkLanguage);


                    if(languageFlag.equals(StaticKey.languageEn)){
                        Locale locale = new Locale(languageFlag);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getActivity().getBaseContext().getResources().updateConfiguration(config,getActivity().getBaseContext().getResources().getDisplayMetrics());

                        Intent intent = new Intent(getActivity(), SplashActivity.class);
                        startActivity(intent);
                        dialogs.dismiss();
                    }else if(languageFlag.equals(StaticKey.languageAr)){
                        Locale locale = new Locale(languageFlag);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getActivity().getBaseContext().getResources().updateConfiguration(config,getActivity().getBaseContext().getResources().getDisplayMetrics());

                        Intent intent = new Intent(getActivity(),SplashActivity.class);
                        startActivity(intent);
                        dialogs.dismiss();
                    }else{
                        Toast.makeText(getActivity(), "Something went wrong. Please try again.", Toast.LENGTH_SHORT).show();
                        dialogs.dismiss();
                    }
                }
            });

            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }else if(childPosition==3){
             alertLayout = inflater.inflate(R.layout.city, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);
            final AppCompatTextView c_text1 = alertLayout.findViewById(R.id.c_text1);
            final AppCompatTextView c_text2 = alertLayout.findViewById(R.id.c_text2);
            final AppCompatTextView city_name1 = alertLayout.findViewById(R.id.city_name1);
            final AppCompatTextView city_name2 = alertLayout.findViewById(R.id.city_name2);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            if(StaticKey.languageEn.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
                c_text1.setTypeface(typeface);

                typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
                c_text2.setTypeface(typeface);
                city_name1.setTypeface(typeface);
                city_name2.setTypeface(typeface);

            }else if(StaticKey.languageAr.equals(language)){
                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
                c_text1.setTypeface(typeface);

                typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
                c_text2.setTypeface(typeface);
                city_name1.setTypeface(typeface);
                city_name2.setTypeface(typeface);


            }else{
                Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
                Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
            }


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }
        





    }

    /**
     * method to initialize the objects
     */
    private void initObjects() {

        // initializing the list of groups
        listDataGroup = new ArrayList<>();

        // initializing the list of child
        listDataChild = new HashMap<>();




     /*   DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;


        expandableListView.setIndicatorBounds(width - GetPixelFromDips(50), width - GetPixelFromDips(10));

*/

        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(getActivity(), listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);

    }

    private int GetPixelFromDips(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }

    /*
     * Preparing the list data
     *
     * Dummy Items
     */
    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.text_alcohol));


        // array of strings
        String[] array;

        // list of alcohol
        List<String> alcoholList = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_alcohol);
        for (String item : array) {
            alcoholList.add(item);
        }


        // Adding child data
        listDataChild.put(listDataGroup.get(0), alcoholList);


        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }
    
}
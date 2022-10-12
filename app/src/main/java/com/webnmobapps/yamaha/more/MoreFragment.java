package com.webnmobapps.yamaha.more;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;


public class MoreFragment extends Fragment {

    ConstraintLayout contact_us_layout, faq_layout, privacy_policy_layout, terms_condition_layout, subscribe_layout, visit_website_layout;
    private String layout_type;
    AppCompatTextView contact_us_text,faq_text,privacy_policy_text,tc_text,stn_text,vow_text;

    private String language = StaticKey.languageEn;
    Typeface typeface;
    SharedPreferences sharedPreferences;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_more, container, false);
        intis(view);



        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);


            contact_us_text.setTypeface(typeface);
            faq_text.setTypeface(typeface);
            privacy_policy_text.setTypeface(typeface);
            tc_text.setTypeface(typeface);
            stn_text.setTypeface(typeface);
            vow_text.setTypeface(typeface);



        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            contact_us_text.setTypeface(typeface);
            faq_text.setTypeface(typeface);
            privacy_policy_text.setTypeface(typeface);
            tc_text.setTypeface(typeface);
            stn_text.setTypeface(typeface);
            vow_text.setTypeface(typeface);





        }else{
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }




        visit_website_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="6";
                alert_dialog(layout_type);
            }
        });
        contact_us_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="1";
                alert_dialog(layout_type);
            }
        });
        faq_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="2";
                alert_dialog(layout_type);
            }
        });

        privacy_policy_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="3";
                alert_dialog(layout_type);
            }
        });

        terms_condition_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="4";
                alert_dialog(layout_type);
            }
        });

        subscribe_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_type="5";
                alert_dialog(layout_type);
            }
        });



        return  view;
    }

    private void alert_dialog(String layout_type) {

        // Dialoogs...
        final Dialog dialogs;

        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View alertLayout = null;


        if(layout_type.equals("1")){
            alertLayout = inflater.inflate(R.layout.contact_us_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }else if(layout_type.equals("2")){
                alertLayout = inflater.inflate(R.layout.faq_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }else if(layout_type.equals("3")){
                alertLayout = inflater.inflate(R.layout.privacy_policy_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }else if(layout_type.equals("4")){
                alertLayout = inflater.inflate(R.layout.terms_conditions_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }else if(layout_type.equals("5")){
                alertLayout = inflater.inflate(R.layout.subcribe_to_news_letter_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);


            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }else if(layout_type.equals("6")){
                alertLayout = inflater.inflate(R.layout.visit_our_website_xml, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);
            final WebView web = alertLayout.findViewById(R.id.webview_website);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            // Webview....

            web.setWebViewClient(new WebViewClient());
            web.getSettings().setLoadsImagesAutomatically(true);
            web.getSettings().setJavaScriptEnabled(true);
            web.getSettings().setBuiltInZoomControls(true);
            //   web.getSettings().setSupportZoom(true);
            web.getSettings().setLoadWithOverviewMode(true);
            web.getSettings().setUseWideViewPort(true);
            web.getSettings().setAllowContentAccess(true);
            web.loadUrl("https://adawliahyms.com/");
            web.setWebViewClient(new WebViewClient());

            // https://adawliahyms.com/

            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

            }

           /* final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
            alert.setView(alertLayout);
            alert.setCancelable(false);
            dialogs = alert.create();
          // dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
          //  dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
        dialogs.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);*/

        }


    private void intis(View view) {



        contact_us_text = view.findViewById(R.id.contact_us_text);
        faq_text = view.findViewById(R.id.faq_text);
        privacy_policy_text = view.findViewById(R.id.privacy_policy_text);
        tc_text = view.findViewById(R.id.tc_text);
        stn_text = view.findViewById(R.id.stn_text);
        vow_text = view.findViewById(R.id.vow_text);
        contact_us_layout = view.findViewById(R.id.contact_us_layout);
        faq_layout = view.findViewById(R.id.faq_layout);
        privacy_policy_layout = view.findViewById(R.id.privacy_policy_layout);
        terms_condition_layout = view.findViewById(R.id.terms_condition_layout);
        subscribe_layout = view.findViewById(R.id.subscribe_layout);
        visit_website_layout = view.findViewById(R.id.visit_website_layout);

    }
}
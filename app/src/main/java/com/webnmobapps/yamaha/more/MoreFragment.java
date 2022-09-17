package com.webnmobapps.yamaha.more;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;


public class MoreFragment extends Fragment {

    ConstraintLayout contact_us_layout, faq_layout, privacy_policy_layout, terms_condition_layout, subscribe_layout, visit_website_layout;
    private String layout_type;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_more, container, false);

        intis(view);


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
        Dialog dialogs;

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
                alertLayout = inflater.inflate(R.layout.contact_us_xml, null);

            }else if(layout_type.equals("3")){
                alertLayout = inflater.inflate(R.layout.contact_us_xml, null);

            }else if(layout_type.equals("4")){
                alertLayout = inflater.inflate(R.layout.contact_us_xml, null);

            }else if(layout_type.equals("5")){
                alertLayout = inflater.inflate(R.layout.contact_us_xml, null);

            }else if(layout_type.equals("6")){
                alertLayout = inflater.inflate(R.layout.contact_us_xml, null);

            }

            final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
            alert.setView(alertLayout);
            alert.setCancelable(false);
            dialogs = alert.create();
          // dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
          //  dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
        dialogs.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);

        }


    private void intis(View view) {
        contact_us_layout = view.findViewById(R.id.contact_us_layout);
        faq_layout = view.findViewById(R.id.faq_layout);
        privacy_policy_layout = view.findViewById(R.id.privacy_policy_layout);
        terms_condition_layout = view.findViewById(R.id.terms_condition_layout);
        subscribe_layout = view.findViewById(R.id.subscribe_layout);
        visit_website_layout = view.findViewById(R.id.subscribe_layout);
    }
}
package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;

public class yamahaGuitarCoursesFragment extends Fragment {


    AppCompatTextView ygc_tx1,ygc_tx2,ygc_tx3,ygc_tx4,ygc_tx5,ygc_tx6,ygc_tx7,ygc_tx8,ygc_tx9,ygc_tx10
            ,ygc_tx11,ygc_tx12,ygc_tx13,ygc_tx14,ygc_tx15,ygc_tx16,ygc_tx17,ygc_tx18,ygc_tx19,ygc_tx20
            ,ygc_tx21,ygc_tx22,ygc_tx23,ygc_tx24,ygc_tx25,ygc_tx26,ygc_tx27,ygc_tx28,cd_text1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_yamaha_guitar_courses, container, false);
        intis(view);




    return view;
    }

    private void intis(View view) {

        cd_text1 = view.findViewById(R.id.cd_text1);
        ygc_tx28 = view.findViewById(R.id.ygc_tx28);
        ygc_tx1 = view.findViewById(R.id.ygc_tx1);
        ygc_tx2 = view.findViewById(R.id.ygc_tx2);
        ygc_tx3 = view.findViewById(R.id.ygc_tx3);
        ygc_tx4 = view.findViewById(R.id.ygc_tx4);
        ygc_tx5 = view.findViewById(R.id.ygc_tx5);
        ygc_tx6 = view.findViewById(R.id.ygc_tx6);
        ygc_tx7 = view.findViewById(R.id.ygc_tx7);
        ygc_tx8 = view.findViewById(R.id.ygc_tx8);
        ygc_tx9 = view.findViewById(R.id.ygc_tx9);
        ygc_tx10 = view.findViewById(R.id.ygc_tx10);
        ygc_tx11 = view.findViewById(R.id.ygc_tx11);
        ygc_tx12 = view.findViewById(R.id.ygc_tx12);
        ygc_tx13 = view.findViewById(R.id.ygc_tx13);
        ygc_tx14 = view.findViewById(R.id.ygc_tx14);
        ygc_tx15 = view.findViewById(R.id.ygc_tx15);
        ygc_tx16 = view.findViewById(R.id.ygc_tx16);
        ygc_tx17 = view.findViewById(R.id.ygc_tx17);
        ygc_tx18 = view.findViewById(R.id.ygc_tx18);
        ygc_tx19 = view.findViewById(R.id.ygc_tx19);
        ygc_tx20 = view.findViewById(R.id.ygc_tx20);
        ygc_tx21 = view.findViewById(R.id.ygc_tx21);
        ygc_tx22 = view.findViewById(R.id.ygc_tx22);
        ygc_tx23 = view.findViewById(R.id.ygc_tx23);
        ygc_tx24 = view.findViewById(R.id.ygc_tx24);
        ygc_tx25 = view.findViewById(R.id.ygc_tx25);
        ygc_tx26 = view.findViewById(R.id.ygc_tx26);
        ygc_tx27 = view.findViewById(R.id.ygc_tx27);


    }
}
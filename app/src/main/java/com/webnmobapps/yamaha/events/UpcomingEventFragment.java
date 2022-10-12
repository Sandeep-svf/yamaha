package com.webnmobapps.yamaha.events;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;
import com.webnmobapps.yamaha.adapter.UpcomingEventAdapter;
import com.webnmobapps.yamaha.utility.StaticKey;

public class UpcomingEventFragment extends Fragment {

    RecyclerView rcv_upcoming_event;
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upcoming_event, container, false);

        rcv_upcoming_event = view.findViewById(R.id.rcv_upcoming_event);

        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion 1" +"language is: "+ language);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        UpcomingEventAdapter upcomingEventAdapter = new UpcomingEventAdapter(getActivity(),language);
        rcv_upcoming_event.setLayoutManager(linearLayoutManager);
        rcv_upcoming_event.setAdapter(upcomingEventAdapter);

        return  view;
    }
}
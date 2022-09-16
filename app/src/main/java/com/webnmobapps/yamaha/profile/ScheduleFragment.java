package com.webnmobapps.yamaha.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;
import com.webnmobapps.yamaha.adapter.EventListAdapter;


public class ScheduleFragment extends Fragment {


    private RecyclerView rcv_event_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*// Inflate the layout for this fragment*/
        View view =  inflater.inflate(R.layout.fragment_schedule, container, false);

        // Initialized view
        inits(view);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        EventListAdapter eventListAdapter = new EventListAdapter(getActivity());
        rcv_event_list.setLayoutManager(linearLayoutManager);
        rcv_event_list.setAdapter(eventListAdapter);


        return  view;
    }

    private void inits(View view) {
        rcv_event_list = view.findViewById(R.id.rcv_event_list);
    }
}
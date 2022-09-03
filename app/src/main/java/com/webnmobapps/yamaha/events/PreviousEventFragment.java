package com.webnmobapps.yamaha.events;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.PreviousEventAdapter;
import com.webnmobapps.yamaha.adapter.UpcomingEventAdapter;


public class PreviousEventFragment extends Fragment {

    RecyclerView rcv_previous_event;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_previous_event, container, false);

        rcv_previous_event = view.findViewById(R.id.rcv_previous_event);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        PreviousEventAdapter previousEventAdapter = new PreviousEventAdapter(getActivity());
        rcv_previous_event.setLayoutManager(linearLayoutManager);
        rcv_previous_event.setAdapter(previousEventAdapter);


        return  view;
    }
}
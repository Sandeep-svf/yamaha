package com.webnmobapps.yamaha.events;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;
import com.webnmobapps.yamaha.adapter.UpcomingEventAdapter;

public class UpcomingEventFragment extends Fragment {

    RecyclerView rcv_upcoming_event;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upcoming_event, container, false);

        rcv_upcoming_event = view.findViewById(R.id.rcv_upcoming_event);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        UpcomingEventAdapter upcomingEventAdapter = new UpcomingEventAdapter(getActivity());
        rcv_upcoming_event.setLayoutManager(linearLayoutManager);
        rcv_upcoming_event.setAdapter(upcomingEventAdapter);

        return  view;
    }
}
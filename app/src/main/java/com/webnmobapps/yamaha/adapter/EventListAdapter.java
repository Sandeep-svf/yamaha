package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.webnmobapps.yamaha.R;

public class EventListAdapter extends RecyclerView.Adapter<EventListViewHolder> {

    private Context context;

    public EventListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public EventListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.event_list_view_holder,parent,false);
        return new EventListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
class EventListViewHolder extends RecyclerView.ViewHolder {

    public EventListViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
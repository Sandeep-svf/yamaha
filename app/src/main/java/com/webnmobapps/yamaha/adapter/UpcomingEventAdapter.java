package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;

public class UpcomingEventAdapter extends RecyclerView.Adapter<UpcomingEventViewHolder> {

    private Context context;


    public UpcomingEventAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public UpcomingEventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.upcoming_event_view_holder,parent,false);
        return new UpcomingEventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingEventViewHolder holder, int position) {
        Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.upcoming_event_image);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
class UpcomingEventViewHolder extends RecyclerView.ViewHolder {
    AppCompatImageView upcoming_event_image;
    public UpcomingEventViewHolder(@NonNull View itemView) {
        super(itemView);
        upcoming_event_image = itemView.findViewById(R.id.upcoming_event_image);
    }
}
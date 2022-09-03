package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;

public class CourcesAdapter extends RecyclerView.Adapter<CourcesViewHolder> {

    private Context context;

    public CourcesAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CourcesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.couces_view_holder,parent,false);
        return new CourcesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourcesViewHolder holder, int position) {

        Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.course_image);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
class CourcesViewHolder extends RecyclerView.ViewHolder {

    AppCompatImageView course_image;

    public CourcesViewHolder(@NonNull View itemView) {
        super(itemView);
        course_image=itemView.findViewById(R.id.course_image);
    }
}
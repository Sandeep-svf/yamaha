package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class UpcomingEventAdapter extends RecyclerView.Adapter<UpcomingEventViewHolder> {

    private Context context;
    private String language;
    Typeface typeface;


    public UpcomingEventAdapter(Context context,String language) {
        this.context = context;
        this.language = language;
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


        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(context, R.font.daxcompact_bold);
            holder.uef_title.setTypeface(typeface);
            holder.sunscribe_button_text.setTypeface(typeface);


            typeface = ResourcesCompat.getFont(context, R.font.daxcompact_medium);
            holder.uef_description.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(context, R.font.cairo_bold);
            holder.uef_title.setTypeface(typeface);
            holder.sunscribe_button_text.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(context, R.font.cairo_medium);
            holder.uef_description.setTypeface(typeface);



        }else{
            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }
        
        
      


        Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.upcoming_event_image);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
class UpcomingEventViewHolder extends RecyclerView.ViewHolder {
    AppCompatImageView upcoming_event_image;
    AppCompatTextView uef_title,uef_description,sunscribe_button_text;
    public UpcomingEventViewHolder(@NonNull View itemView) {
        super(itemView);
        upcoming_event_image = itemView.findViewById(R.id.upcoming_event_image);
        uef_description = itemView.findViewById(R.id.uef_description);
        sunscribe_button_text = itemView.findViewById(R.id.sunscribe_button_text);
        uef_title = itemView.findViewById(R.id.uef_title);
    }
}
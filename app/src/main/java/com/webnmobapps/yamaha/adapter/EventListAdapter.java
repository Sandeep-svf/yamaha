package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

public class EventListAdapter extends RecyclerView.Adapter<EventListViewHolder> {

    private Context context;
    private String language;
    private Typeface typeface;

    public EventListAdapter(Context context, String language) {
        this.context = context;
        this.language = language;
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
        if(StaticKey.languageEn.equals(language)){




            typeface = ResourcesCompat.getFont(context, R.font.daxcompact_extrabold);
            holder.text_1.setTypeface(typeface);
            holder.text_2.setTypeface(typeface);
            holder.text_3.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){

            typeface = ResourcesCompat.getFont(context, R.font.cairo_extrabold);
            holder.text_1.setTypeface(typeface);
            holder.text_2.setTypeface(typeface);
            holder.text_3.setTypeface(typeface);



        }else{
            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
class EventListViewHolder extends RecyclerView.ViewHolder {

    AppCompatTextView text_3,text_2,text_1;
    public EventListViewHolder(@NonNull View itemView) {
        super(itemView);
        text_3 = itemView.findViewById(R.id.text_3);
        text_2 = itemView.findViewById(R.id.text_2);
        text_1 = itemView.findViewById(R.id.text_1);
    }
}
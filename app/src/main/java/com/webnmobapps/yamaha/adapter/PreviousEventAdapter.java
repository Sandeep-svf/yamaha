package com.webnmobapps.yamaha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.courses.PopularMusicCourseFragment;
import com.webnmobapps.yamaha.events.PreviousEventDetailsFragment;

public class PreviousEventAdapter extends RecyclerView.Adapter<PreviousEventViewHolder> {

    private Context context;

    public PreviousEventAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PreviousEventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.previous_event_view_holder,parent,false);
        return new PreviousEventViewHolder(view);




    }

    @Override
    public void onBindViewHolder(@NonNull PreviousEventViewHolder holder, int position) {

        Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.previous_event_image);

        holder.main_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PreviousEventDetailsFragment fragment = new PreviousEventDetailsFragment();
                FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
class PreviousEventViewHolder extends RecyclerView.ViewHolder {


    CardView main_layout;
    AppCompatImageView previous_event_image;
    public PreviousEventViewHolder(@NonNull View itemView) {
        super(itemView);
        previous_event_image = itemView.findViewById(R.id.previous_event_image);
        main_layout = itemView.findViewById(R.id.main_layout);

    }
}
package com.webnmobapps.yamaha.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.courses.JuniourCourseFragment;
import com.webnmobapps.yamaha.courses.MusicFriendCourseFragment;
import com.webnmobapps.yamaha.courses.PopularMusicCourseFragment;
import com.webnmobapps.yamaha.courses.YamahaPianoCourseFragment;
import com.webnmobapps.yamaha.courses.yamahaGuitarCoursesFragment;
import com.webnmobapps.yamaha.model.CoourseListModel;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CourcesAdapter extends RecyclerView.Adapter<CourcesViewHolder> {

    private Context context;
    private String language;
    List<CoourseListModel> coourseListModelList = new ArrayList<>();
    private Typeface typeface;

    public CourcesAdapter(Context context, List<CoourseListModel> coourseListModelList, String language) {
        this.context = context;
        this.coourseListModelList = coourseListModelList;
        this.language = language;
    }

    @NonNull
    @Override
    public CourcesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.couces_view_holder,parent,false);
        return new CourcesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourcesViewHolder holder, @SuppressLint("RecyclerView") int position) {

        if(StaticKey.languageEn.equals(language)){
            typeface = ResourcesCompat.getFont(context, R.font.daxcompact_bold);
            holder.course_type.setTypeface(typeface);
            holder.course_title.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(context, R.font.daxcompact_medium);
            holder.course_description.setTypeface(typeface);


        }else if(StaticKey.languageAr.equals(language)){
            typeface = ResourcesCompat.getFont(context, R.font.cairo_bold);
            holder.course_type.setTypeface(typeface);
            holder.course_title.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(context, R.font.cairo_medium);
            holder.course_description.setTypeface(typeface);
          

        }else{
            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language","Sesssion 1" + "ALL WENT WRONG");
        }
        
        
        
        
       // Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.course_image);
        Glide.with(context).load(coourseListModelList.get(position).getCourseImage()).placeholder(R.drawable.ic_launcher_background)
                .into(holder.course_image);
        holder.course_type.setText(coourseListModelList.get(position).getCourseType());
        holder.course_title.setText(coourseListModelList.get(position).getCourseName());
        holder.course_description.setText(coourseListModelList.get(position).getCourseDescription());

        holder.course_layout_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(position==0) {
                    JuniourCourseFragment fragment = new JuniourCourseFragment();
                    FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                 //   Glide.with(context).load(R.drawable.juniour_course_image).placeholder(R.drawable.ic_launcher_background).into(holder.course_image);
                }else if(position==1){
                    YamahaPianoCourseFragment fragment = new YamahaPianoCourseFragment();
                    FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }else if(position==2){
                    yamahaGuitarCoursesFragment fragment = new yamahaGuitarCoursesFragment();
                    FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }else if(position==3){
                    MusicFriendCourseFragment fragment = new MusicFriendCourseFragment();
                    FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }else if(position==4){
                    PopularMusicCourseFragment fragment = new PopularMusicCourseFragment();
                    FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return coourseListModelList.size();
    }
}
class CourcesViewHolder extends RecyclerView.ViewHolder {

    AppCompatImageView course_image;
    CircleImageView next_button_course;
    CardView course_layout_cardview;
    AppCompatTextView course_title,course_type,course_description;

    public CourcesViewHolder(@NonNull View itemView) {
        super(itemView);
        course_image = itemView.findViewById(R.id.course_image);
        next_button_course = itemView.findViewById(R.id.next_button_course);
        course_layout_cardview = itemView.findViewById(R.id.course_layout_cardview);
        course_type = itemView.findViewById(R.id.course_type);
        course_title = itemView.findViewById(R.id.course_title);
        course_description = itemView.findViewById(R.id.course_description);
    }
}
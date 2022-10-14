package com.webnmobapps.yamaha.courses;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;
import com.webnmobapps.yamaha.model.CoourseListModel;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.ArrayList;
import java.util.List;


public class CourseFragment extends Fragment {

    AppCompatImageView course_banner_image;
    RecyclerView rcv_courses;
    List<CoourseListModel> coourseListModelList = new ArrayList<>();
    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_course, container, false);
        intis(view);

        coourseListModelList = new ArrayList<>();

        sharedPreferences= getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language=sharedPreferences.getString("language","");


        Log.e("check_language","Sesssion Course Fragment:" +"language is: "+ language);


        

        Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(course_banner_image);

        add_data_in_model();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        CourcesAdapter courcesAdapter = new CourcesAdapter(getActivity(),coourseListModelList ,language);
        rcv_courses.setLayoutManager(linearLayoutManager);
        rcv_courses.setAdapter(courcesAdapter);

        return  view;
    }

    private void add_data_in_model() {


        CoourseListModel coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.juniour_course_image);
        coourseListModel.setCourseType(getString(R.string.juniour_course));
        coourseListModel.setCourseName(getString(R.string.juniour_course_title));
        coourseListModel.setCourseDescription(getString(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_piano_banner);
        coourseListModel.setCourseType(getString(R.string.yamaha_piano_course));
        coourseListModel.setCourseName(getString(R.string.yamaha_piano_course_title));
        coourseListModel.setCourseDescription(getString(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_guitar_banner);
        coourseListModel.setCourseType(getString(R.string.yamaha_guitar_course));
        coourseListModel.setCourseName(getString(R.string.yamaha_guitar_course_title));
        coourseListModel.setCourseDescription(getString(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_music_friend_banner);
        coourseListModel.setCourseType(getString(R.string.music_friend_course));
        coourseListModel.setCourseName(getString(R.string.music_friend_course_title));
        coourseListModel.setCourseDescription(getString(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_popular_music_banner);
        coourseListModel.setCourseType(getString(R.string.popular_music_course));
        coourseListModel.setCourseName(getString(R.string.popular_music_course_title));
        coourseListModel.setCourseDescription(getString(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);


    }

    private void intis(View view) {
        course_banner_image = view.findViewById(R.id.course_banner_image);
        rcv_courses = view.findViewById(R.id.rcv_courses);
    }


}


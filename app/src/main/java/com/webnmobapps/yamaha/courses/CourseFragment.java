package com.webnmobapps.yamaha.courses;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.CourcesAdapter;
import com.webnmobapps.yamaha.model.CoourseListModel;

import java.util.ArrayList;
import java.util.List;


public class CourseFragment extends Fragment {

    AppCompatImageView course_banner_image;
    RecyclerView rcv_courses;
    List<CoourseListModel> coourseListModelList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_course, container, false);
        intis(view);

        Glide.with(getActivity()).load(R.drawable.courses_banner).placeholder(R.drawable.ic_launcher_background).into(course_banner_image);

        add_data_in_model();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        CourcesAdapter courcesAdapter = new CourcesAdapter(getActivity(),coourseListModelList );
        rcv_courses.setLayoutManager(linearLayoutManager);
        rcv_courses.setAdapter(courcesAdapter);

        return  view;
    }

    private void add_data_in_model() {


        CoourseListModel coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.juniour_course_image);
        coourseListModel.setCourseType("Juniour Course");
        coourseListModel.setCourseName("Acquire lifelong musical skill with YAMAHA.");
        coourseListModel.setCourseDescription(String.valueOf(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_piano_banner);
        coourseListModel.setCourseType("Yamaha piano Course");
        coourseListModel.setCourseName("Learn, enjoy and express yourself on piano.");
        coourseListModel.setCourseDescription(String.valueOf(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_guitar_banner);
        coourseListModel.setCourseType("Yamaha Guitar Course");
        coourseListModel.setCourseName("Let us develop the guitarist in you");
        coourseListModel.setCourseDescription(String.valueOf(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_music_friend_banner);
        coourseListModel.setCourseType("Music Friends Course");
        coourseListModel.setCourseName("Start your musical journey with your favourite instrument");
        coourseListModel.setCourseDescription(String.valueOf(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);

        coourseListModel = new CoourseListModel();
        coourseListModel.setCourseImage(R.drawable.course_popular_music_banner);
        coourseListModel.setCourseType("Popular Music Course");
        coourseListModel.setCourseName("Share your creativity and passion and become the performer you always wanted to be.");
        coourseListModel.setCourseDescription(String.valueOf(R.string.book_script_1));
        coourseListModelList.add(coourseListModel);


    }

    private void intis(View view) {
        course_banner_image = view.findViewById(R.id.course_banner_image);
        rcv_courses = view.findViewById(R.id.rcv_courses);
    }
}
package com.webnmobapps.yamaha.profile;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.adapter.ExpandableListViewAdapter;
import com.webnmobapps.yamaha.courses.PopularMusicCourseFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProfileFragment extends Fragment {

    private ExpandableListView expandableListView;
    private ExpandableListViewAdapter expandableListViewAdapter;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;

    private ConstraintLayout schedule_layout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);



        // initializing the views
        initViews(view);

        schedule_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScheduleFragment fragment = new ScheduleFragment();
                FragmentManager fragmentManager = (getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_contaner, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });





        // initializing the listeners
        initListeners();

        // initializing the objects
        initObjects();

        // preparing list data
        initListData();


        return  view;
    }


    /**
     * method to initialize the views
     */
    private void initViews(View view) {

        expandableListView = view.findViewById(R.id.expandableListView);
        schedule_layout = view.findViewById(R.id.schedule_layout);

    }

    /**
     * method to initialize the listeners
     */
    private void initListeners() {




       /* expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                ImageView groupIndicator = (ImageView) clickedView.findViewById(R.id.help_group_indicator);
                if (parent.isGroupExpanded(groupPosition)) {
                    parent.collapseGroup(groupPosition);
                    groupIndicator.setImageResource(R.drawable.down_icon);
                } else {
                    parent.expandGroup(groupPosition);
                    groupIndicator.setImageResource(R.drawable.up_icon);
                }
                return true;
            }
        });*/


        // ExpandableListView on child click listener
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                Log.e("check_position", String.valueOf(childPosition)+"0");

              alert_dialog(childPosition);
                return false;
            }



        });

        // ExpandableListView Group expanded listener
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

                Log.e("check_position", String.valueOf(groupPosition)+"1");
                Toast.makeText(getActivity(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // ExpandableListView Group collapsed listener
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

                Log.e("check_position", String.valueOf(groupPosition)+"2");

                Toast.makeText(getActivity(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void alert_dialog(int childPosition) {
        // Dialoogs...
        Dialog dialogs;

        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View alertLayout = null;
        if(childPosition==0){
             alertLayout = inflater.inflate(R.layout.account_information, null);

             final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);



            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });



        }else if(childPosition==1){
             alertLayout = inflater.inflate(R.layout.change_password, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);


            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);



            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }else if(childPosition==2){
             alertLayout = inflater.inflate(R.layout.language, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);

            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }else if(childPosition==3){
             alertLayout = inflater.inflate(R.layout.city, null);
            final AppCompatImageView cross_image_layout = alertLayout.findViewById(R.id.cross_image_layout);

            dialogs = new Dialog(getActivity());
            dialogs.setContentView(alertLayout);
            dialogs.setCancelable(false);
            dialogs.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogs.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT,WindowManager.LayoutParams.FILL_PARENT);
            dialogs.show();
            dialogs.setCanceledOnTouchOutside(true);


            cross_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogs.dismiss();
                }
            });

        }
        





    }

    /**
     * method to initialize the objects
     */
    private void initObjects() {

        // initializing the list of groups
        listDataGroup = new ArrayList<>();

        // initializing the list of child
        listDataChild = new HashMap<>();




     /*   DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;


        expandableListView.setIndicatorBounds(width - GetPixelFromDips(50), width - GetPixelFromDips(10));

*/

        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(getActivity(), listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);

    }

    private int GetPixelFromDips(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }

    /*
     * Preparing the list data
     *
     * Dummy Items
     */
    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.text_alcohol));


        // array of strings
        String[] array;

        // list of alcohol
        List<String> alcoholList = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_alcohol);
        for (String item : array) {
            alcoholList.add(item);
        }


        // Adding child data
        listDataChild.put(listDataGroup.get(0), alcoholList);


        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }
    
}
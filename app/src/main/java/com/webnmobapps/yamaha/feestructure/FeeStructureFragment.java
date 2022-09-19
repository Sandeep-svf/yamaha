package com.webnmobapps.yamaha.feestructure;

import android.os.Bundle;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.courses.CourseFragment;


public class FeeStructureFragment extends Fragment {

    LinearLayoutCompat back;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fee_structure, container, false);
        intis(view);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CourseFragment pageFragment = new CourseFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                // ((ConstraintLayout)findViewById(R.id.fragment_contaner)).removeAllViews();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fragmentTransaction.replace(R.id.fragment_contaner, pageFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });



        return  view;
    }

    private void intis(View view) {
        back = view.findViewById(R.id.back);
    }
}
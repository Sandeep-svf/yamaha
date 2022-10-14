package com.webnmobapps.yamaha.booking;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TimePicker;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.webnmobapps.yamaha.MainActivity;
import com.webnmobapps.yamaha.R;
import com.webnmobapps.yamaha.utility.StaticKey;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class BookingFragment extends Fragment {


    List<String> city_list = new ArrayList<>();
    List<String> course_list = new ArrayList<>();
    List<String> course_type_list = new ArrayList<>();
    List<String> day_list = new ArrayList<>();

    AppCompatImageView book_imag_1, book_imag_2;
    AppCompatTextView book_tx1, book_tx2, sub_layout1, user_name_book, user_email_book, prefered_time_spin;
    AppCompatButton book_now_button;

    SharedPreferences sharedPreferences;
    private String language = StaticKey.languageEn;
    Typeface typeface;

    AppCompatSpinner city_spin, course_spin, course_type_spin, prefered_day_spin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booking, container, false);

        inits(view);
        add_data_in_cityList();
        add_data_in_course_lis();
        add_data_in_course_type_list();
        add_data_in_day_list();


        sharedPreferences = getActivity().getSharedPreferences("LANGUAGE_NAME", Context.MODE_PRIVATE);
        language = sharedPreferences.getString("language", "");


        Log.e("check_language", "Sesssion 1" + "language is: " + language);

        if (StaticKey.languageEn.equals(language)) {
            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_bold);
            book_tx1.setTypeface(typeface);
            sub_layout1.setTypeface(typeface);
            user_name_book.setTypeface(typeface);
            book_now_button.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.daxcompact_medium);
            book_tx2.setTypeface(typeface);
            user_email_book.setTypeface(typeface);

        } else if (StaticKey.languageAr.equals(language)) {
            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_bold);
            book_tx1.setTypeface(typeface);
            sub_layout1.setTypeface(typeface);
            user_name_book.setTypeface(typeface);
            book_now_button.setTypeface(typeface);

            typeface = ResourcesCompat.getFont(getActivity(), R.font.cairo_medium);
            book_tx2.setTypeface(typeface);
            user_email_book.setTypeface(typeface);


        } else {
            Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
            Log.e("check_language", "Sesssion 1" + "ALL WENT WRONG");
        }


        Glide.with(getActivity()).load(R.drawable.music_friend_course_image).placeholder(R.drawable.ic_launcher_background).into(book_imag_1);
        Glide.with(getActivity()).load(R.drawable.book_banner2).placeholder(R.drawable.ic_launcher_background).into(book_imag_2);

        prefered_time_spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = showCustomTimePicker();
                Log.e("time",time);
            }
        });


        spinnerAdapter dAdapter = new spinnerAdapter(getActivity(), R.layout.custom_spinner_two, city_list);
        dAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dAdapter.addAll(city_list);
        dAdapter.add(getResources().getString(R.string.select_city));
        city_spin.setAdapter(dAdapter);
        city_spin.setSelection(dAdapter.getCount());

        spinnerAdapter dAdapter2 = new spinnerAdapter(getActivity(), R.layout.custom_spinner_two, course_list);
        dAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dAdapter2.addAll(course_list);
        dAdapter2.add(getResources().getString(R.string.select_course));
        course_spin.setAdapter(dAdapter2);
        course_spin.setSelection(dAdapter2.getCount());


        spinnerAdapter dAdapter3 = new spinnerAdapter(getActivity(), R.layout.custom_spinner_two, course_type_list);
        dAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dAdapter3.addAll(course_type_list);
        dAdapter3.add(getResources().getString(R.string.type_of_course));
        course_type_spin.setAdapter(dAdapter3);
        course_type_spin.setSelection(dAdapter3.getCount());

        spinnerAdapter dAdapter4 = new spinnerAdapter(getActivity(), R.layout.custom_spinner_two, day_list);
        dAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dAdapter4.addAll(day_list);
        dAdapter4.add(getResources().getString(R.string.preferred_day));
        prefered_day_spin.setAdapter(dAdapter4);
        prefered_day_spin.setSelection(dAdapter4.getCount());


        return view;
    }


    public String showCustomTimePicker() {

        final Calendar myCalender = Calendar.getInstance();
        int hour = myCalender.get(Calendar.HOUR_OF_DAY);
        int minute = myCalender.get(Calendar.MINUTE);
        String time;


        TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                if (view.isShown()) {
                    myCalender.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    myCalender.set(Calendar.MINUTE, minute);

                }
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, myTimeListener, hour, minute, true);
        timePickerDialog.setTitle("Choose hour:");
        timePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        timePickerDialog.show();

        return hour+" : "+minute;
    }




    private void add_data_in_day_list() {
        day_list.add(getResources().getString(R.string.sunday));
        day_list.add(getResources().getString(R.string.monday));
        day_list.add(getResources().getString(R.string.tuesday));
        day_list.add(getResources().getString(R.string.wednesday));
        day_list.add(getResources().getString(R.string.thursday));
        day_list.add(getResources().getString(R.string.friday));
        day_list.add(getResources().getString(R.string.saturday));
    }

    private void add_data_in_course_type_list() {
        course_type_list.add(getResources().getString(R.string.type_a));
        course_type_list.add(getResources().getString(R.string.type_b));
        course_type_list.add(getResources().getString(R.string.type_c));
        course_type_list.add(getResources().getString(R.string.type_d));
        course_type_list.add(getResources().getString(R.string.type_e));
        course_type_list.add(getResources().getString(R.string.type_f));
    }

    @SuppressLint("ResourceType")
    private void add_data_in_course_lis() {
        course_list.add(getResources().getString(R.string.juniour_course));
        course_list.add(getResources().getString(R.string.yamaha_piano_course));
        course_list.add(getResources().getString(R.string.yamaha_guitar_course));
        course_list.add(getResources().getString(R.string.music_friend_course));
        course_list.add(getResources().getString(R.string.popular_music_course));
    }

    private void add_data_in_cityList() {
        city_list.add(getResources().getString(R.string.riyadh));
        city_list.add(getResources().getString(R.string.jeddah));
    }

    private void inits(View view) {

        city_spin = view.findViewById(R.id.city_spin);
        course_spin = view.findViewById(R.id.course_spin);
        course_type_spin = view.findViewById(R.id.course_type_spin);
        prefered_day_spin = view.findViewById(R.id.prefered_day_spin);
        prefered_time_spin = view.findViewById(R.id.prefered_time_spin);
        user_name_book = view.findViewById(R.id.user_name_book);
        user_email_book = view.findViewById(R.id.user_email_book);
        sub_layout1 = view.findViewById(R.id.sub_layout1);
        book_tx2 = view.findViewById(R.id.book_tx2);
        book_tx1 = view.findViewById(R.id.book_tx1);
        book_now_button = view.findViewById(R.id.book_now_button);
        book_imag_1 = view.findViewById(R.id.book_imag_1);
        book_imag_2 = view.findViewById(R.id.book_imag_2);

    }
}


 class spinnerAdapter extends ArrayAdapter<String>
{
    protected spinnerAdapter(Context context, int textViewResourceId, List<String> smonking)
    {
        super(context, textViewResourceId);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public int getCount()
    {
        int count = super.getCount();
        return count > 0 ? count - 1 : count;
    }
}
package com.ibo.calender;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView=findViewById(R.id.calendarView);
        button=findViewById(R.id.button);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String total="Year : "+year+"month : "+month+"day : "+dayOfMonth;
                Toast.makeText(getApplicationContext(),total,Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.example.samsung.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    CheckBox c1;
    LinearLayout main;
    RatingBar r;
    CalendarView Date;
    RadioButton rb1, rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕?!",Toast.LENGTH_SHORT).show();
            }
        });

        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"너의 이름은 무엇이니? ㅎㅎ",Toast.LENGTH_SHORT).show();
            }
        });
        main = (LinearLayout)findViewById(R.id.activity_main);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    main.setBackgroundColor(Color.BLUE);
                }
                else{
                    main.setBackgroundColor(Color.WHITE);
                }
            }
        });

        r = (RatingBar)findViewById(R.id.ratingBar);
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), rating+"접입니다",Toast.LENGTH_SHORT).show();
            }
        });
        Date = (CalendarView)findViewById(R.id.calendarView);
        Date.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), +year+"-"+(month+1)+"-"+dayOfMonth+"입니다",Toast.LENGTH_SHORT).show();
            }
        });
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"남자입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"여자입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

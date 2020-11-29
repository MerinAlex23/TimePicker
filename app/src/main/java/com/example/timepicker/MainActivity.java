package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
TimePicker timepicker;
Button buttton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView1);
        timepicker=findViewById(R.id.timepicker);
        buttton1=findViewById(R.id.button);

        timepicker.setIs24HourView(true);


        buttton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        textView1.setText(getCurrentTime());
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="current time "+timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute();
        return currentTime;

    }
}

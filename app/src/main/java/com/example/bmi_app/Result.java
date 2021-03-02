package com.example.bmi_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView t2 = findViewById(R.id.BMI_value);

        Float result = getIntent().getFloatExtra("BMI",0);
        t2.setText(""+result);
    }
}
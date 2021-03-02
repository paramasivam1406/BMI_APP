package com.example.bmi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Calc = findViewById(R.id.Calc);


        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });
    }
    public void openactivity()
    {
        Intent intent = new Intent(this,Result.class);

        EditText e1 = findViewById(R.id.weight);
        EditText e2 = findViewById(R.id.height);
        float a = Float.parseFloat(e1.getText().toString());
        float b = Float.parseFloat((e2.getText().toString()));
        float d = b/100;
        float c = a/(d*d);
        intent.putExtra("BMI",c);

        startActivity(intent);
    }
}
package com.rku.flowercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView flower;
    Button red,green,gray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flower = findViewById(R.id.image_view);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        gray = findViewById(R.id.gray);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flower.setImageResource(R.drawable.ic_baseline_filter_vintage_red);
                red.setTextColor(getResources().getColor(R.color.pink));
                red.setBackgroundColor(getResources().getColor(R.color.red));

                green.setTextColor(getResources().getColor(R.color.green));
                green.setBackgroundColor(getResources().getColor(R.color.pink));

                gray.setTextColor(getResources().getColor(R.color.gray));
                gray.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });


        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flower.setImageResource(R.drawable.ic_baseline_filter_vintage_green);
                green.setTextColor(getResources().getColor(R.color.pink));
                green.setBackgroundColor(getResources().getColor(R.color.green));

                red.setTextColor(getResources().getColor(R.color.red));
                red.setBackgroundColor(getResources().getColor(R.color.pink));

                gray.setTextColor(getResources().getColor(R.color.gray));
                gray.setBackgroundColor(getResources().getColor(R.color.pink));

            }
        });


        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flower.setImageResource(R.drawable.ic_baseline_filter_vintage_gray);
                gray.setTextColor(getResources().getColor(R.color.pink));
                gray.setBackgroundColor(getResources().getColor(R.color.gray));


                green.setTextColor(getResources().getColor(R.color.green));
                green.setBackgroundColor(getResources().getColor(R.color.pink));

                red.setTextColor(getResources().getColor(R.color.red));
                red.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });


    }
}
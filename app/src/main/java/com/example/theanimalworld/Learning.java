package com.example.theanimalworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Learning extends AppCompatActivity {
    private Handler handler;
    TextView text1, text2, text3, text4, text5;
    ImageView img1, img2, img3, img4, img5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        img1 = findViewById(R.id.djaj);
        img2 = findViewById(R.id.hisan);
        img3 = findViewById(R.id.dikromi);
        img4 = findViewById(R.id.kalb);
        img5 = findViewById(R.id.himar);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();
                showTextViewForDuration(1000, text1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();
                showTextViewForDuration(1000, text2);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();
                showTextViewForDuration(1000, text3);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();
                showTextViewForDuration(1000, text4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();
                showTextViewForDuration(1000, text5);
            }
        });

    }

    private void showTextViewForDuration(long duration, TextView textView) {
        textView.setVisibility(View.VISIBLE);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setVisibility(View.INVISIBLE);
            }
        }, duration);
    }
}
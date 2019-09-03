package com.example.homeworkwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarDemo extends AppCompatActivity {
    Button Submit;
    RatingBar RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.ratingBar);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(RatingBar.getRating());
                Toast.makeText(RatingBarDemo.this, rating, Toast.LENGTH_SHORT).show();

            }
        });
    }
}

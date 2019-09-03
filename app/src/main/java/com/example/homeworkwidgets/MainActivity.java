package com.example.homeworkwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button a1, a2,a3,a4,a5,a6;
    public void init(){
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View v) {
     int id = v.getId();
        Intent intent = null;
        switch (id)
        {
            case R.id.a1 : intent = new Intent(MainActivity.this,SpinnerActivity.class);break;
            case R.id.a2 : intent = new Intent(MainActivity.this,RatingBarDemo.class);break;
            case R.id.a3 : intent = new Intent(MainActivity.this,ImageSwitcherDemo.class);break;
            case R.id.a4 : intent = new Intent(MainActivity.this,ImageSliderDemo.class);break;
            case R.id.a5 : intent =new Intent(MainActivity.this,SearchViewDemo.class);break;
            case R.id.a6 : intent =new Intent(MainActivity.this,TextWatcherDemo.class);break;
        }
        if (intent!=null)
            startActivity(intent);
    }
}

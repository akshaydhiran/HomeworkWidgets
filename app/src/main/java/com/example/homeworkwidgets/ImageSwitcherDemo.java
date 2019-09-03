package com.example.homeworkwidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitcherDemo extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button nextButton;
    int imageSwitcherImages[] ={R.drawable.ben_stokes,R.drawable.cottrell_salute,R.drawable.kane_williomsone,R.drawable.mitchell_starc,R.drawable.viratkholi};
    int switcherImagelength = imageSwitcherImages.length;
    int counter = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher_demo);
        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        nextButton = (Button) findViewById(R.id.button);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT
                ));
                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.viratkholi);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        imageSwitcher.setOutAnimation(aniOut);
        imageSwitcher.setInAnimation(aniIn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter == switcherImagelength){
                    counter = 0;
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
                else{
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
            }
        });

    }
}

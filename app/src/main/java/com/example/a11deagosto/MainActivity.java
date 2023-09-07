package com.example.a11deagosto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imagen1);
        Button button = findViewById(R.id.boton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(new ScaleAnimation(0.2f, 4f, 0.2f, 4f));
                animationSet.setDuration(5000);
                imageView.startAnimation(animationSet);
                animationSet.addAnimation(new RotateAnimation(0, 360,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));
                animationSet.setInterpolator(new AccelerateDecelerateInterpolator());

            }
        });

        ImageView imageView1 = findViewById(R.id.imagen2);
        Button button1 = findViewById(R.id.boton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(new ScaleAnimation(0.2f, 4f, 0.2f, 4f));
                animationSet.setDuration(5000);
                imageView1.startAnimation(animationSet);
                animationSet.addAnimation(new RotateAnimation(360, 0,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));
                animationSet.setInterpolator(new AccelerateDecelerateInterpolator());

            }
        });

    }
}
package com.reduanssoftware.abcpublicschool;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.Cancellable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;


import androidx.viewpager2.widget.ViewPager2;

public class Shape_Activity extends AppCompatActivity {

    private View decorView;
    private LottieAnimationView animationview_shape, left_arrow_shape, home_animation_shape, right_arrow_shape;
    private TextView textview_shape;
    private int i = 0;
    private static final int MAX_INDEX = 10;
    private static final int MIN_INDEX = 0;
    private static final int[] textureArrayWin = {R.raw.circle_animation,R.raw.triangle_animation,
            R.raw.square_animation, R.raw.star_animation, R.raw.plus_animation, R.raw.minus_animation,
            R.raw.multiple_animation, R.raw.divide_animation, R.raw.heart_animation, R.raw.left_arrow, R.raw.right_arrow};
    private final String[] textArray = {"Circle","Tringle", "Square", "Star", "Plus", "Minus",
            "Multiple", "Divide", "Heart", "Left", "Right"};

    MediaPlayer mediaPlayer;
    int[] tracks = {R.raw.a, R.raw.b, R.raw.c,R.raw.d, R.raw.e, R.raw.f,
            R.raw.g, R.raw.h, R.raw.i,R.raw.j}; // Add your track resources here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_shape);

        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();

        animationview_shape = findViewById(R.id.animationview_shape);
        left_arrow_shape = findViewById(R.id.left_arrow_shape);
        home_animation_shape = findViewById(R.id.home_animation_shape);
        right_arrow_shape = findViewById(R.id.right_arrow_shape);
        textview_shape = findViewById(R.id.textview_shape);


        mediaPlayer = MediaPlayer.create(this, tracks[i]);

        left_arrow_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i > MIN_INDEX) {
                    i--;
                    updateAnimationAndText();

                }
            }
        });

        right_arrow_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < MAX_INDEX -1) {
                    i++;
                    updateAnimationAndText();


                }
            }
        });

        home_animation_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shape_Activity.this, Home_Design_Activity.class);
                startActivity(intent);
            }
        });

        // Initialize with the first animation and text
        updateAnimationAndText();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    private void updateAnimationAndText() {
        animationview_shape.setAnimation(textureArrayWin[i]);
        animationview_shape.playAnimation();
       textview_shape.setText(textArray[i]);
        updateButtonVisibility();
        updateMediaPlayer();
    }




    private void updateButtonVisibility() {
        left_arrow_shape.setVisibility(i > MIN_INDEX ? View.VISIBLE : View.GONE);
        right_arrow_shape.setVisibility(i < MAX_INDEX ? View.VISIBLE : View.GONE);
    }

    private void updateMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, tracks[i]);
        mediaPlayer.start();
    }




    // Other methods like transparentStatusbarAndNavigation and autoHiddenNavigationBar can be defined here.
    // //Navigation bar hide decorView start
    private void transparentStatusbarAndNavigation(){

        if (Build.VERSION.SDK_INT>=19 && Build.VERSION.SDK_INT<21.){
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION , true);



        }
        if (Build.VERSION.SDK_INT>=19){

            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            );

        }
        if (Build.VERSION.SDK_INT>=21){

            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION ,false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);

        }

    }
    private void setWindowFlag(int i,boolean b){

        Window win = getWindow();
        WindowManager.LayoutParams winparams = win.getAttributes();

        if (b){
            winparams.flags |= i;
        }else {
            winparams.flags &= ~i;
        }
        win.setAttributes(winparams);

    }
    private void autoHiddenNavigationBar(){

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {

                if (i==0){

                    decorView.setSystemUiVisibility(hideSystemBars());

                }


            }
        });

    }

    private int hideSystemBars(){
        return  View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);

        if (hasFocus){
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }

    // //Navigation bar hide decorView end


}
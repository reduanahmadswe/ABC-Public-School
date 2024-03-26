package com.reduanssoftware.abcpublicschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Clour_Activity extends AppCompatActivity {


    private View decorView;

    private TextView textview_clour;

    private int i = 0;
    private static final int MAX_INDEX = 10;
    private static final int MIN_INDEX = 0;

    private LottieAnimationView animationview_clour,left_arrow_clour,home_animation_clour,right_arrow_clour;


    private static final int[] clourArray = {R.drawable.coler_green,R.drawable.coler_white,
            R.drawable.coler_yellow,R.drawable.clour_red,R.drawable.clour_black,
            R.drawable.clour_blue,R.drawable.indigo_cllour};


    private final String[] textArray = {"Green","White", "Yellow", "Red", "Black", "Blue",
            "Indigo"};

    MediaPlayer mediaPlayer;
    int[] tracks = {R.raw.a, R.raw.b, R.raw.c,R.raw.d, R.raw.e, R.raw.f,R.raw.g}; // Add your track resources here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_clour);

        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();


        animationview_clour = findViewById(R.id.animationview_clour);
        left_arrow_clour = findViewById(R.id.left_arrow_clour);
        home_animation_clour = findViewById(R.id.home_animation_clour);
        right_arrow_clour = findViewById(R.id.right_arrow_clour);
        textview_clour = findViewById(R.id.textview_clour);


        left_arrow_clour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i > MIN_INDEX) {
                    i--;
                    updateAnimationAndText();

                }
            }
        });

        right_arrow_clour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < MAX_INDEX -1) {
                    i++;
                    updateAnimationAndText();


                }
            }
        });

        home_animation_clour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Clour_Activity.this, Home_Design_Activity.class);
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
        animationview_clour.setAnimation(clourArray[i]);
        animationview_clour.playAnimation();
        textview_clour.setText(textArray[i]);
        updateButtonVisibility();
        updateMediaPlayer();
    }




    private void updateButtonVisibility() {
        left_arrow_clour.setVisibility(i > MIN_INDEX ? View.VISIBLE : View.GONE);
        right_arrow_clour.setVisibility(i < MAX_INDEX ? View.VISIBLE : View.GONE);
    }

    private void updateMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, tracks[i]);
        mediaPlayer.start();
    }



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
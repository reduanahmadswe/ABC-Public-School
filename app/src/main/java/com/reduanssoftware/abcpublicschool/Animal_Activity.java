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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Animal_Activity extends AppCompatActivity {

    private View decorView;
    private LottieAnimationView animationview_animal, left_arrow_animal, home_animation_animal, right_arrow_animal;
    private TextView textview_animal;

    private Button replay_button;
    private int i = 0;
    private static final int MAX_INDEX = 10;
    private static final int MIN_INDEX = 0;
    private static final int[] textureArrayWin = {R.raw.tiger,R.raw.lion,
            R.raw.horse, R.raw.fox, R.raw.elephant, R.raw.dog,
            R.raw.cute_tiger, R.raw.cow, R.raw.cat, R.raw.butterfly, R.raw.bear};
    private final String[] textArray = {"Tiger","Lion", "Horse", "Fox", "Elephant", "Dog",
            "Cute Tiger", "Cow", "Cat", "Butterfly", "Bear"};

    MediaPlayer mediaPlayer;
    int[] tracks = {R.raw.tigerv, R.raw.lionv, R.raw.horsev,R.raw.foxv, R.raw.elephantv, R.raw.dogv,
            R.raw.tigercute, R.raw.cowv, R.raw.catv,R.raw.butterflyv}; // Add your track resources here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal);

        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();

        animationview_animal = findViewById(R.id.animationview_animal);
        left_arrow_animal = findViewById(R.id.left_arrow_animal);
        home_animation_animal = findViewById(R.id.home_animation_animal);
        right_arrow_animal = findViewById(R.id.right_arrow_animal);
        textview_animal = findViewById(R.id.textview_animal);
        replay_button = findViewById(R.id.replay_button);



        mediaPlayer = MediaPlayer.create(this, tracks[i]);

        left_arrow_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i > MIN_INDEX) {
                    i--;
                    updateAnimationAndText();

                }
            }
        });

        right_arrow_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < MAX_INDEX -1) {
                    i++;
                    updateAnimationAndText();


                }
            }
        });

        home_animation_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animal_Activity.this, Home_Design_Activity.class);
                startActivity(intent);
            }
        });


        replay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateMediaPlayer();
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
        animationview_animal.setAnimation(textureArrayWin[i]);
        animationview_animal.playAnimation();
        textview_animal.setText(textArray[i]);
        updateButtonVisibility();
        updateMediaPlayer();
    }

    private void updateButtonVisibility() {
        left_arrow_animal.setVisibility(i > MIN_INDEX ? View.VISIBLE : View.GONE);
        right_arrow_animal.setVisibility(i < MAX_INDEX ? View.VISIBLE : View.GONE);
    }

    private void updateMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, tracks[i]);
        mediaPlayer.start();

        mediaPlayer.seekTo(0); // Rewind the media player to the beginning
        mediaPlayer.start();   // Start playing again
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
package com.reduanssoftware.abcpublicschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class Birds_Activity extends AppCompatActivity {

    private View decorView;
    LottieAnimationView animationview_birds,left_arrow_birds,home_animation_birds,right_arrow_birds;

    int i=0;

    private int [] textureArrayWin = {R.raw.dove,R.raw.duck,R.raw.eagle,R.raw.hen,R.raw.macaw,R.raw.owl,R.raw.parrot,R.raw.peacock,R.raw.pigeon,R.raw.turkey,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_birds);
        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();


        animationview_birds=findViewById(R.id.animationview_birds);
        left_arrow_birds=findViewById(R.id.left_arrow_birds);
        home_animation_birds=findViewById(R.id.home_animation_birds);
        right_arrow_birds=findViewById(R.id.right_arrow_birds);



        left_arrow_birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i > 0) {
                    i--;
                    animationview_birds.setAnimation(textureArrayWin[i]);
                    animationview_birds.playAnimation();
                }

                updateButtonVisibility();
            }
        });

        right_arrow_birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < 9) {
                    i++;
                    animationview_birds.setAnimation(textureArrayWin[i]);
                    animationview_birds.playAnimation();
                }

                updateButtonVisibility();
            }
        });

        home_animation_birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Birds_Activity.this,Home_Design_Activity.class);
                startActivity(intent);

            }
        });







    }
    // This function updates the visibility of the left_arrow_birds button based on the value of 'i'.
    private void updateButtonVisibility() {

        if (i == 0) {
            left_arrow_birds.setVisibility(View.GONE);
        } else {
            left_arrow_birds.setVisibility(View.VISIBLE);
        }
        if (i == 9) {
            right_arrow_birds.setVisibility(View.GONE);
        } else {
            right_arrow_birds.setVisibility(View.VISIBLE);
        }
    }



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

}
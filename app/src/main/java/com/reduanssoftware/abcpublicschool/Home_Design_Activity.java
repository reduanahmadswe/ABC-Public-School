package com.reduanssoftware.abcpublicschool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Home_Design_Activity extends AppCompatActivity {

    private View decorView;
    ImageView settings,exit_to_app,ok_exit,cancle_exit;
    LinearLayout setting_layout, exit_layout,Alphabets,Number,shape,emoji,birds,animal,colour;
    Button go_home;
    RelativeLayout home_design_activity;


    View rate_us_five_stars;
    View share;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_home_design);
        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();

        settings = findViewById(R.id.settings);
        setting_layout = findViewById(R.id.setting_layout);
        exit_layout = findViewById(R.id.exit_layout);
        exit_to_app = findViewById(R.id.exit_to_app);
        go_home = findViewById(R.id.go_home);
        home_design_activity = findViewById(R.id.home_design_activity);
        ok_exit = findViewById(R.id.ok_exit);
        cancle_exit = findViewById(R.id.cancle_exit);
        rate_us_five_stars = findViewById(R.id.rate_us_five_stars);
        share = findViewById(R.id.share);
        Alphabets = findViewById(R.id.Alphabets);
        Number = findViewById(R.id.Number);
        shape = findViewById(R.id.shape);
        emoji = findViewById(R.id.emoji);
        birds = findViewById(R.id.birds);
        animal = findViewById(R.id.animal);
        colour=findViewById(R.id.clour);



        final String appakageName = getPackageName();




        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setting_layout.setVisibility(View.VISIBLE);
               // home_design_activity.setBackgroundColor(View.FOCUSABLES_ALL);

            }
        });

        go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setting_layout.setVisibility(View.GONE);

            }
        });

        //quit or exit this app
        exit_to_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit_layout.setVisibility(View.VISIBLE);
              //  home_design_activity.setBackgroundColor(View.FOCUSABLES_ALL);

            }
        });

        ok_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finishAffinity();

            }
        });


        cancle_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exit_layout.setVisibility(View.GONE);

            }
        });

        // Rate this app
        rate_us_five_stars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id"+appakageName)));

            }
        });

        //Share this app //
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Click this app \n https://play.google.com/store/apps/details?id"+appakageName);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,"Share this apps"));


            }
        });


        // Alphabets layout to display_Activity //
        Alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Display_Activity.class);
                startActivity(intent);

            }
        });


        // Number layout to Number_Activity //
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Number_Activity.class);
                startActivity(intent);

            }
        });

        // shape layout to Number_Activity //
        shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Shape_Activity.class);
                startActivity(intent);

            }
        });

        emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Emoji_Activity.class);
                startActivity(intent);

            }
        });

        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Birds_Activity.class);
                startActivity(intent);

            }
        });


        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Animal_Activity.class);
                startActivity(intent);

            }
        });

        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Design_Activity.this,Clour_Activity.class);
                startActivity(intent);

            }
        });









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
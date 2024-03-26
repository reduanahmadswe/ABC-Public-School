package com.reduanssoftware.abcpublicschool;

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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Number_Activity extends AppCompatActivity {

    //Navigation bar hide decorView
    private View decorView;

    private TextView number_1,number_2,number_3,number_4,number_5,number_6,number_7,number_8,number_9,number_10,
            number_11,number_12,number_13,number_14,number_15,number_16,number_17,number_18,number_19,number_20,
            number_21,number_22,number_23,number_24,number_25,number_26,number_27,number_28,number_29,number_30,
            number_31,number_32,number_33,number_34,number_35,number_36,number_37,number_38,number_39,number_40,
            number_41,number_42,number_43,number_44,number_45,number_46,number_47,number_48,number_49,number_50;


    private LinearLayout layout_number_1,layout_number_2;

    private TextView number_28_50,number_1_27;
    LottieAnimationView back_arrow_number,back_arrow_number2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Status bar hide two line code //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );


        setContentView(R.layout.activity_number);

        //Navigation bar hide decorView
        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();

        back_arrow_number = findViewById(R.id.back_arrow_number);
        back_arrow_number2 = findViewById(R.id.back_arrow_number2);
        layout_number_1 = findViewById(R.id.layout_number_1);
        number_28_50 = findViewById(R.id.number_28_50);
        layout_number_2 =findViewById(R.id.layout_number_2);
        number_1_27 =findViewById(R.id.number_1_27);


        // This is number poricoy

        number_1 = findViewById(R.id.number_1);   number_21 = findViewById(R.id.number_21);  number_41 = findViewById(R.id.number_41);
        number_2 = findViewById(R.id.number_2);   number_22 = findViewById(R.id.number_22);  number_42 = findViewById(R.id.number_42);
        number_3 = findViewById(R.id.number_3);   number_23 = findViewById(R.id.number_23);  number_43 = findViewById(R.id.number_43);
        number_4 = findViewById(R.id.number_4);   number_24 = findViewById(R.id.number_24);  number_44 = findViewById(R.id.number_44);
        number_5 = findViewById(R.id.number_5);   number_25 = findViewById(R.id.number_25);  number_45 = findViewById(R.id.number_45);
        number_6 = findViewById(R.id.number_6);   number_26 = findViewById(R.id.number_26);  number_46 = findViewById(R.id.number_46);
        number_7 = findViewById(R.id.number_7);   number_27 = findViewById(R.id.number_27);  number_47 = findViewById(R.id.number_47);
        number_8 = findViewById(R.id.number_8);   number_28 = findViewById(R.id.number_28);  number_48 = findViewById(R.id.number_48);
        number_9 = findViewById(R.id.number_9);   number_29 = findViewById(R.id.number_29);  number_49 = findViewById(R.id.number_49);
        number_10 = findViewById(R.id.number_10); number_30 = findViewById(R.id.number_30);  number_50 = findViewById(R.id.number_50);
        number_11 = findViewById(R.id.number_11); number_31 = findViewById(R.id.number_31);
        number_12 = findViewById(R.id.number_12); number_32 = findViewById(R.id.number_32);
        number_13 = findViewById(R.id.number_13); number_33 = findViewById(R.id.number_33);
        number_14 = findViewById(R.id.number_14); number_34 = findViewById(R.id.number_34);
        number_15 = findViewById(R.id.number_15); number_35 = findViewById(R.id.number_35);
        number_16 = findViewById(R.id.number_16); number_36 = findViewById(R.id.number_36);
        number_17 = findViewById(R.id.number_17); number_37 = findViewById(R.id.number_37);
        number_18 = findViewById(R.id.number_18); number_38 = findViewById(R.id.number_38);
        number_19 = findViewById(R.id.number_19); number_39 = findViewById(R.id.number_39);
        number_20 = findViewById(R.id.number_20); number_40 = findViewById(R.id.number_40);


        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.one);       final MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.twenty_one);   final MediaPlayer mediaPlayer41 = MediaPlayer.create(this,R.raw.forty_one);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.two);       final MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.twenty_two);   final MediaPlayer mediaPlayer42 = MediaPlayer.create(this,R.raw.forty_two);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.three);     final MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.twenty_three); final MediaPlayer mediaPlayer43 = MediaPlayer.create(this,R.raw.forty_three);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.four);      final MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.twenty_four);  final MediaPlayer mediaPlayer44 = MediaPlayer.create(this,R.raw.forty_four);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.five);      final MediaPlayer mediaPlayer25 = MediaPlayer.create(this,R.raw.twenty_five);  final MediaPlayer mediaPlayer45= MediaPlayer.create(this,R.raw.forty_five);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.six);       final MediaPlayer mediaPlayer26 = MediaPlayer.create(this,R.raw.twenty_six);   final MediaPlayer mediaPlayer46 = MediaPlayer.create(this,R.raw.forty_six);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.seven);     final MediaPlayer mediaPlayer27 = MediaPlayer.create(this,R.raw.twenty_seven); final MediaPlayer mediaPlayer47 = MediaPlayer.create(this,R.raw.forty_seven);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.eight);     final MediaPlayer mediaPlayer28= MediaPlayer.create(this,R.raw.twenty_eight);  final MediaPlayer mediaPlayer48 = MediaPlayer.create(this,R.raw.forty_eight);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.nine);      final MediaPlayer mediaPlayer29 = MediaPlayer.create(this,R.raw.twenty_nine);  final MediaPlayer mediaPlayer49 = MediaPlayer.create(this,R.raw.forty_nine);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.ten);      final MediaPlayer mediaPlayer30= MediaPlayer.create(this,R.raw.thirty);        final MediaPlayer mediaPlayer50 = MediaPlayer.create(this,R.raw.fifty);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.eleven);   final MediaPlayer mediaPlayer31 = MediaPlayer.create(this,R.raw.thirty_one);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.twelve);   final MediaPlayer mediaPlayer32 = MediaPlayer.create(this,R.raw.thirty_two);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.thirteen); final MediaPlayer mediaPlayer33 = MediaPlayer.create(this,R.raw.thirty_three);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.fourteen); final MediaPlayer mediaPlayer34= MediaPlayer.create(this,R.raw.thirty_four);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.fifteen);  final MediaPlayer mediaPlayer35 = MediaPlayer.create(this,R.raw.thirty_five);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.sixteen);  final MediaPlayer mediaPlayer36 = MediaPlayer.create(this,R.raw.thirty_six);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.seventeen);final MediaPlayer mediaPlayer37 = MediaPlayer.create(this,R.raw.thirty_seven);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.eighteen); final MediaPlayer mediaPlayer38 = MediaPlayer.create(this,R.raw.thirty_eight);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.nineteen); final MediaPlayer mediaPlayer39= MediaPlayer.create(this,R.raw.thirty_nine);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.twenty);   final MediaPlayer mediaPlayer40 = MediaPlayer.create(this,R.raw.forty);


        number_1.setOnClickListener(view -> mediaPlayer1.start());      number_26.setOnClickListener(view -> mediaPlayer26.start());
        number_2.setOnClickListener(view -> mediaPlayer2.start());      number_27.setOnClickListener(view -> mediaPlayer27.start());
        number_3.setOnClickListener(view -> mediaPlayer3.start());      number_28.setOnClickListener(view -> mediaPlayer28.start());
        number_4.setOnClickListener(view -> mediaPlayer4.start());      number_29.setOnClickListener(view -> mediaPlayer29.start());
        number_5.setOnClickListener(view -> mediaPlayer5.start());      number_30.setOnClickListener(view -> mediaPlayer30.start());
        number_6.setOnClickListener(view -> mediaPlayer6.start());      number_31.setOnClickListener(view -> mediaPlayer31.start());
        number_7.setOnClickListener(view -> mediaPlayer7.start());      number_32.setOnClickListener(view -> mediaPlayer32.start());
        number_8.setOnClickListener(view -> mediaPlayer8.start());      number_33.setOnClickListener(view -> mediaPlayer33.start());
        number_9.setOnClickListener(view -> mediaPlayer9.start());      number_34.setOnClickListener(view -> mediaPlayer34.start());
        number_10.setOnClickListener(view -> mediaPlayer10.start());    number_35.setOnClickListener(view -> mediaPlayer35.start());
        number_11.setOnClickListener(view -> mediaPlayer11.start());    number_36.setOnClickListener(view -> mediaPlayer36.start());
        number_12.setOnClickListener(view -> mediaPlayer12.start());    number_37.setOnClickListener(view -> mediaPlayer37.start());
        number_13.setOnClickListener(view -> mediaPlayer13.start());    number_38.setOnClickListener(view -> mediaPlayer38.start());
        number_14.setOnClickListener(view -> mediaPlayer14.start());    number_39.setOnClickListener(view -> mediaPlayer39.start());
        number_15.setOnClickListener(view -> mediaPlayer15.start());    number_40.setOnClickListener(view -> mediaPlayer40.start());
        number_16.setOnClickListener(view -> mediaPlayer16.start());    number_41.setOnClickListener(view -> mediaPlayer41.start());
        number_17.setOnClickListener(view -> mediaPlayer17.start());    number_42.setOnClickListener(view -> mediaPlayer42.start());
        number_18.setOnClickListener(view -> mediaPlayer18.start());    number_43.setOnClickListener(view -> mediaPlayer43.start());
        number_19.setOnClickListener(view -> mediaPlayer19.start());    number_44.setOnClickListener(view -> mediaPlayer44.start());
        number_20.setOnClickListener(view -> mediaPlayer20.start());    number_45.setOnClickListener(view -> mediaPlayer45.start());
        number_21.setOnClickListener(view -> mediaPlayer21.start());    number_46.setOnClickListener(view -> mediaPlayer46.start());
        number_22.setOnClickListener(view -> mediaPlayer22.start());    number_47.setOnClickListener(view -> mediaPlayer47.start());
        number_23.setOnClickListener(view -> mediaPlayer23.start());    number_48.setOnClickListener(view -> mediaPlayer48.start());
        number_24.setOnClickListener(view -> mediaPlayer24.start());    number_49.setOnClickListener(view -> mediaPlayer49.start());
        number_25.setOnClickListener(view -> mediaPlayer25.start());    number_50.setOnClickListener(view -> mediaPlayer50.start());





        back_arrow_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Number_Activity.this,Home_Design_Activity.class);
                startActivity(intent);

            }
        });

        back_arrow_number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Number_Activity.this,Home_Design_Activity.class);
                startActivity(intent);

            }
        });


        number_28_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_number_1.setVisibility(View.GONE);
                layout_number_2.setVisibility(View.VISIBLE);

            }
        });

        number_1_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_number_2.setVisibility(View.GONE);
                layout_number_1.setVisibility(View.VISIBLE);

            }
        });

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
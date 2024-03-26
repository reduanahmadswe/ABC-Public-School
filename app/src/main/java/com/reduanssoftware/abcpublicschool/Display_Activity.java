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

public class Display_Activity extends AppCompatActivity {

    //Navigation bar hide decorView
    private View decorView;
    LinearLayout number_animation_al;
    TextView a_alphabet,b_alphabet,c_alphabet,d_alphabet,e_alphabet,f_alphabet,g_alphabet,h_alphabet,i_alphabet,j_alphabet,
            k_alphabet,l_alphabet,m_alphabet,n_alphabet,o_alphabet,p_alphabet,q_alphabet,r_alphabet,s_alphabet,t_alphabet,
            u_alphabet,v_alphabet,w_alphabet,x_alphabet,y_alphabet,z_alphabet;

    LottieAnimationView back_arrow,circle;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Status bar hide two line code //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView(R.layout.activity_display);

        //Navigation bar hide decorView
        transparentStatusbarAndNavigation();
        autoHiddenNavigationBar();

        number_animation_al = findViewById(R.id.number_animation_al);
        a_alphabet = findViewById(R.id.a_alphabet);
        b_alphabet = findViewById(R.id.b_alphabet);
        c_alphabet = findViewById(R.id.c_alphabet);
        d_alphabet = findViewById(R.id.d_alphabet);
        e_alphabet = findViewById(R.id.e_alphabet);
        f_alphabet = findViewById(R.id.f_alphabet);
        g_alphabet = findViewById(R.id.g_alphabet);
        h_alphabet = findViewById(R.id.h_alphabet);
        i_alphabet = findViewById(R.id.i_alphabet);
        j_alphabet = findViewById(R.id.j_alphabet);
        k_alphabet = findViewById(R.id.k_alphabet);
        l_alphabet = findViewById(R.id.l_alphabet);
        m_alphabet = findViewById(R.id.m_alphabet);
        n_alphabet = findViewById(R.id.n_alphabet);
        o_alphabet = findViewById(R.id.o_alphabet);
        p_alphabet = findViewById(R.id.p_alphabet);
        q_alphabet = findViewById(R.id.q_alphabet);
        r_alphabet = findViewById(R.id.r_alphabet);
        s_alphabet = findViewById(R.id.s_alphabet);
        t_alphabet = findViewById(R.id.t_alphabet);
        u_alphabet = findViewById(R.id.u_alphabet);
        v_alphabet = findViewById(R.id.v_alphabet);
        w_alphabet = findViewById(R.id.w_alphabet);
        x_alphabet = findViewById(R.id.x_alphabet);
        y_alphabet = findViewById(R.id.y_alphabet);
        z_alphabet = findViewById(R.id.z_alphabet);

        back_arrow = findViewById(R.id.back_arrow);






        final MediaPlayer mediaPlayera = MediaPlayer.create(this,R.raw.a);
        final MediaPlayer mediaPlayerb = MediaPlayer.create(this,R.raw.b);
        final MediaPlayer mediaPlayerc = MediaPlayer.create(this,R.raw.c);
        final MediaPlayer mediaPlayerd = MediaPlayer.create(this,R.raw.d);
        final MediaPlayer mediaPlayere = MediaPlayer.create(this,R.raw.e);
        final MediaPlayer mediaPlayerf = MediaPlayer.create(this,R.raw.f);
        final MediaPlayer mediaPlayerg = MediaPlayer.create(this,R.raw.g);
        final MediaPlayer mediaPlayerh = MediaPlayer.create(this,R.raw.h);
        final MediaPlayer mediaPlayeri = MediaPlayer.create(this,R.raw.i);
        final MediaPlayer mediaPlayerj = MediaPlayer.create(this,R.raw.j);
        final MediaPlayer mediaPlayerk = MediaPlayer.create(this,R.raw.k);
        final MediaPlayer mediaPlayerl = MediaPlayer.create(this,R.raw.l);
        final MediaPlayer mediaPlayerm = MediaPlayer.create(this,R.raw.m);
        final MediaPlayer mediaPlayern = MediaPlayer.create(this,R.raw.n);
        final MediaPlayer mediaPlayero = MediaPlayer.create(this,R.raw.o);
        final MediaPlayer mediaPlayerp = MediaPlayer.create(this,R.raw.p);
        final MediaPlayer mediaPlayerq = MediaPlayer.create(this,R.raw.q);
        final MediaPlayer mediaPlayerr = MediaPlayer.create(this,R.raw.r);
        final MediaPlayer mediaPlayers = MediaPlayer.create(this,R.raw.s);
        final MediaPlayer mediaPlayert = MediaPlayer.create(this,R.raw.t);
        final MediaPlayer mediaPlayeru = MediaPlayer.create(this,R.raw.u);
        final MediaPlayer mediaPlayerv = MediaPlayer.create(this,R.raw.v);
        final MediaPlayer mediaPlayerw = MediaPlayer.create(this,R.raw.w);
        final MediaPlayer mediaPlayerx = MediaPlayer.create(this,R.raw.x);
        final MediaPlayer mediaPlayery = MediaPlayer.create(this,R.raw.y);
        final MediaPlayer mediaPlayerz = MediaPlayer.create(this,R.raw.z);






        a_alphabet.setOnClickListener(view -> mediaPlayera.start());
        b_alphabet.setOnClickListener(view -> mediaPlayerb.start());
        c_alphabet.setOnClickListener(view -> mediaPlayerc.start());
        d_alphabet.setOnClickListener(view -> mediaPlayerd.start());
        e_alphabet.setOnClickListener(view -> mediaPlayere.start());
        f_alphabet.setOnClickListener(view -> mediaPlayerf.start());
        g_alphabet.setOnClickListener(view -> mediaPlayerg.start());
        h_alphabet.setOnClickListener(view -> mediaPlayerh.start());
        i_alphabet.setOnClickListener(view -> mediaPlayeri.start());
        j_alphabet.setOnClickListener(view -> mediaPlayerj.start());
        k_alphabet.setOnClickListener(view -> mediaPlayerk.start());
        l_alphabet.setOnClickListener(view -> mediaPlayerl.start());
        m_alphabet.setOnClickListener(view -> mediaPlayerm.start());
        n_alphabet.setOnClickListener(view -> mediaPlayern.start());
        o_alphabet.setOnClickListener(view -> mediaPlayero.start());
        p_alphabet.setOnClickListener(view -> mediaPlayerp.start());
        q_alphabet.setOnClickListener(view -> mediaPlayerq.start());
        r_alphabet.setOnClickListener(view -> mediaPlayerr.start());
        s_alphabet.setOnClickListener(view -> mediaPlayers.start());
        t_alphabet.setOnClickListener(view -> mediaPlayert.start());
        u_alphabet.setOnClickListener(view -> mediaPlayeru.start());
        v_alphabet.setOnClickListener(view -> mediaPlayerv.start());
        w_alphabet.setOnClickListener(view -> mediaPlayerw.start());
        x_alphabet.setOnClickListener(view -> mediaPlayerx.start());
        y_alphabet.setOnClickListener(view -> mediaPlayery.start());
        z_alphabet.setOnClickListener(view -> mediaPlayerz.start());




        number_animation_al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Display_Activity.this,Number_Activity.class);
                startActivity(intent);

            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Display_Activity.this,Home_Design_Activity.class);
                startActivity(intent);

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
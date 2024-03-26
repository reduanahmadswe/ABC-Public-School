package com.reduanssoftware.abcpublicschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView(R.layout.activity_main);


        progressBarid = (ProgressBar) findViewById(R.id.progressBarid);

        Thread thread = new Thread(() -> {

            doWork();
            StartApp();


        });
        thread.start();
    }

    public void doWork(){


        int progress;
        for (progress =20; progress <=100; progress = progress +20){

            try {
                Thread.sleep(1000);
                progressBarid.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }


    public void StartApp(){

        Intent intent = new Intent(MainActivity.this,Home_Design_Activity.class);
        startActivity(intent);
        finish();


    }

}
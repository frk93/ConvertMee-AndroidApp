package com.example.farrukh.convertmee;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainView.class);
               startActivity(intent);

               overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        }, 3000);

        setContentView(R.layout.activity_main);


    }
}

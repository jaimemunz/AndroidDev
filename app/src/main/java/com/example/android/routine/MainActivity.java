package com.example.android.routine;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerView = (TextView) findViewById(R.id.timer_display_view);
    }



    public void startRoutine(View view){

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timerView.setText("Seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                timerView.setText("Done!");
            }
        }.start();
    }

    public void editRoutine(View view){
        setContentView(R.layout.routine_edit);

    }

}

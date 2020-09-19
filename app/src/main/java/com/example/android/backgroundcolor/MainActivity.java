package com.example.android.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redSeekbar;
    private SeekBar greenSeekbar;
    private SeekBar blueSeekbar;

    private Button btnReset;

    private LinearLayout llroot;

    private TextView amt_red, amt_green, amt_blue;

    private int redColor = 0;
    private int greenColor = 0;
    private int blueColor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redSeekbar = findViewById(R.id.seekbar_red);
        greenSeekbar = findViewById(R.id.seekbar_green);
        blueSeekbar = findViewById(R.id.seekbar_blue);

        btnReset = findViewById(R.id.btn_reset);

        llroot = findViewById(R.id.ll_root);

        amt_red = findViewById(R.id.red_amt);
        amt_green = findViewById(R.id.green_amt);
        amt_blue = findViewById(R.id.blue_amt);

        redSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redColor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenColor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueColor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redColor = 0;
                greenColor = 0;
                blueColor = 0;
                redSeekbar.setProgress(0);
                greenSeekbar.setProgress(0);
                blueSeekbar.setProgress(0);
                changeBackgroundColor();
            }
        });

        changeBackgroundColor();
    }

    private void changeBackgroundColor(){
        llroot.setBackgroundColor(Color.argb(255, redColor, greenColor, blueColor));
        amt_red.setText(String.valueOf(redColor));
        amt_green.setText(String.valueOf(greenColor));
        amt_blue.setText(String.valueOf(blueColor));
    }
}
package com.bikomobile.sample.donutprogres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.bikomobile.donutprogress.DonutProgress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DonutProgress donutProgressCustom = (DonutProgress) findViewById(R.id.donut_progress_custom);

        final DonutProgress donutProgress1 = (DonutProgress) findViewById(R.id.donut_progress_1);


        final DonutProgress donutProgress2 = (DonutProgress) findViewById(R.id.donut_progress_2);
        donutProgress2.setProgress(40);


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    donutProgressCustom.setProgress(progress);
                    donutProgress1.setProgress(progress);
                    donutProgress2.setProgress(progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }


    }
}

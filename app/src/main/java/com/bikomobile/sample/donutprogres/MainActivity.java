package com.bikomobile.sample.donutprogres;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.bikomobile.donutprogress.DonutProgress;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DonutProgress donutProgress1 = (DonutProgress) findViewById(R.id.donut_progress_1);
        final DonutProgress donutProgress2 = (DonutProgress) findViewById(R.id.donut_progress_2);
        final DonutProgress donutProgress3 = (DonutProgress) findViewById(R.id.donut_progress_3);
        final DonutProgress donutProgress4 = (DonutProgress) findViewById(R.id.donut_progress_4);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                    donutProgress1.setProgress(progress);

                    donutProgress2.setProgress(progress);

                    donutProgress3.setProgress(progress);

                    donutProgress4.setProgress(progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }

        // With animation
        showDonutProgress();
        View btnReset = findViewById(R.id.btn_reset_anim);
        if (btnReset != null) {
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDonutProgress();
                }
            });
        }

    }

    private void showDonutProgress() {
        showDonutProgress(35, R.id.donut_progress_anim_1);
        showDonutProgress(98, R.id.donut_progress_anim_2);
        showDonutProgress(55, R.id.donut_progress_anim_3);
        showDonutProgress(45, R.id.donut_progress_anim_4);
    }

    private void showDonutProgress(final int percent, int res) {
        final DonutProgress donutProgressAnim = (DonutProgress) findViewById(res);

        if (donutProgressAnim != null) {
            donutProgressAnim.setSuffix("%");
            donutProgressAnim.setProgressWithAnimation(percent, 20);

        }
    }

}

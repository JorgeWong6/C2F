package com.example.jorge.c2f;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView TVC, TVF;
    SeekBar seekBar;
    double c, f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVC = (TextView) findViewById(R.id.TVC);
        TVF = (TextView) findViewById(R.id.TVF);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(400);
        seekBar.setProgress(200);

        c = seekBar.getProgress() - 200;
        f = c * 1.8 + 32;

        TVC.setText(String.format(Locale.getDefault(),"0.0 C", c  ));
        TVF.setText(String.format(Locale.getDefault()," 0.1 F", f  ));

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                c = progress - 200;
                f = c * 1.8 + 32;
                TVC.setText(String.format(Locale.getDefault(), "0.0" , c ));
                TVF.setText(String.format(Locale.getDefault(), "0.0" , f));
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

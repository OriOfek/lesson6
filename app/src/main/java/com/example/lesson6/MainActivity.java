package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch s;
    ToggleButton tb;
    boolean check1;
    boolean check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (Switch) findViewById(R.id.switch1);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
    }

    public void check(View view) {
        check1 = s.isChecked();
        check2 = tb.isChecked();

        if(check1)
        {
            if (check2)
            {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
            else
            {
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        }
        else
            if(check2)
            {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
            else
            {
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }

    }

    public void reset(View view) {
        tb.setChecked(false);
        s.setChecked(false);
    }
}

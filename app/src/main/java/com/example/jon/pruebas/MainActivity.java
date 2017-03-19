package com.example.jon.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;

public class MainActivity extends AppCompatActivity {

    private AnalogClock reloj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reloj = (AnalogClock) findViewById(R.id.reloj);


        reloj.
    }
}

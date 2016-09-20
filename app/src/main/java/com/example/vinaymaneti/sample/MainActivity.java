package com.example.vinaymaneti.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String vairable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if ("Sample".equals(vairable)) {
            Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "Hello error", Toast.LENGTH_LONG).show();
        }
    }
}

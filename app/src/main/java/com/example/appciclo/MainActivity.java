package com.example.appciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Ciclo", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo", "onStart");
    }
}
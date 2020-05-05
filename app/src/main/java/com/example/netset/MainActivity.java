package com.example.netset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Intent in = new Intent(Intent.ACTION_MAIN);
        //in.setClassName("com.android.settings", "com.android.settings.Settings$TestingSettingsActivity");
        in.setClassName("com.android.settings", "com.android.settings.RadioInfo");
        startActivity(in);
        finish();
    }
}

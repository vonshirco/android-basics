package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //Get data
        Intent i = getIntent();
        String message = i.getStringExtra("theWord");
        ((TextView)findViewById(R.id.textView)).setText(message);
    }
}
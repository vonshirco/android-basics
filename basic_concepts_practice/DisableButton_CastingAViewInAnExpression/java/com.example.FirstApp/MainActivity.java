package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Casting a View in an Expression (Not a statement fix)
    public void disable(View v){
        findViewById(R.id.button2).setEnabled(false);
        ((Button)findViewById(R.id.button2)).setText("New New Disabled");
    }
}



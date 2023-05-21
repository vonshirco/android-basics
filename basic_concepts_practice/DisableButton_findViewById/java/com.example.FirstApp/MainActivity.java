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

    //Using findViewById
    public void disable(View v){
        View myView = findViewById(R.id.button2);
        myView.setEnabled(false);
        Button button = (Button) myView;
        button.setText("New Disabled");
    }
}



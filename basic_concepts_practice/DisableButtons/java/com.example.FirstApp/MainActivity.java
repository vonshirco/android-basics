package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(tag:"fail", msg:"it's not working");
    }

    //Changing button text when clicked and disables it
    public void disable (View v){
        v.setEnabled(false);
        Button b = (Button) v; //Variable currently in v we are casting it  to a button and it gives a new object of type button
        b.setText("Disabled");
    }

}



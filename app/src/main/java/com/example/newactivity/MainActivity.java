package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void launchSettings(View v){
        //Launch a new activity
        Intent i = new Intent(this, SettingsActivity.class);
        //Adding data
        String message = ((EditText)findViewById(R.id.editText)).getText().toString();
        i.putExtra("theWord", message);
        startActivity(i);
    }
}
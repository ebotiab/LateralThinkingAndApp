package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);
    }

    //    Starts activity with the next puzzle
    public void Next (View view){
        Intent i = new Intent(this, Puzzle2Activity.class);
        startActivity(i);
    }

    //    Starts activity with the main activity
    public void returnMenu (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
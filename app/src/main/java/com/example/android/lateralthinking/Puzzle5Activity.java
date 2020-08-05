package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Puzzle5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle5);
    }

    //    Starts activity with the next puzzle
    public void previousPuzzle (View view){
        Intent i = new Intent(this, Puzzle4Activity.class);
        startActivity(i);
    }

    //    Starts activity with the previous puzzle
    public void nextPuzzle (View view){
        Intent i = new Intent(this, Puzzle6Activity.class);
        startActivity(i);
    }

}
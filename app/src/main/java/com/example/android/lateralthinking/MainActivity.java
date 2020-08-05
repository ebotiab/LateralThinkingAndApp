package com.example.android.lateralthinking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void startQuiz (View view){
        Intent i = new Intent(this, PuzzleActivity.class);
        startActivity(i);
    }
}
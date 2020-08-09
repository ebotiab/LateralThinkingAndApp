package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class Puzzle8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle8);
        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"hiccup", "hiccough", "hipo"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);
                Score.addResultEditText(answer, Arrays.asList(validSols));
                Intent i = new Intent(getApplicationContext(), Puzzle6Activity.class);
                startActivity(i);
            }
        });
    }


    //    Starts activity with the previous puzzle
    public void submitAnwers (View view){
        Intent i = new Intent(this, Puzzle6Activity.class);
        startActivity(i);
    }

}
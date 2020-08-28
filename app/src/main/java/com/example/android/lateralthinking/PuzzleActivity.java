package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class PuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        //    Initialize the results of the puzzles
        Score.initPuzResults();

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"dwarf", "short", "small", "enano", "bajo", "bajito", "pequeño"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);

                //    Update the score if the answer contains one elem of validSols
                Score.checkAnswerEditText(answer,Arrays.asList(validSols),1);

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle2Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
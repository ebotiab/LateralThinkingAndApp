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

        //    Avoid to an incorrect value of Score.results
        Score.checkScore(7);

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"hiccup", "hiccough", "hipo"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);

                //    Update the score if the answer contains one elem of validSols
                Score.checkAnswerEditText(answer,Arrays.asList(validSols));

                //    Starts the activity that displays the score obtained
                Intent i = new Intent(getApplicationContext(), displayScoreActivity.class);
                startActivity(i);
            }
        });
    }
}
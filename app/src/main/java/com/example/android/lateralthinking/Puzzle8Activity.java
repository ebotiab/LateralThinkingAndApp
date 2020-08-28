package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                EditText answer = findViewById(R.id.editTextAnswer);

                //    Update the score if the answer contains one elem of validSols
                Score.checkAnswerEditText(answer,Arrays.asList(validSols),8);

                //    Starts the activity with that displays the score of the quiz
                Intent i = new Intent(getApplicationContext(), displayScoreActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
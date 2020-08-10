package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class Puzzle5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle5);

        //    Avoid to an incorrect value of Score.results
        Score.checkScore(4);

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"fish", "fishes", "pez", "peces"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);
                Score.checkAnswerEditText(answer, Arrays.asList(validSols));

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle6Activity.class);
                startActivity(i);
            }
        });
    }
}
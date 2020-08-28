package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class Puzzle4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle4);

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"plane", "purchase","avión","paracaídas"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);

                //    Update the score if the answer contains one elem of validSols
                Score.checkAnswerEditText(answer,Arrays.asList(validSols),4);

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle5Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
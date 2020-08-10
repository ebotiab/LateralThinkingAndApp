package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        //    Avoid to an incorrect value of Score.results
        Score.checkScore(0);

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String[] validSols = new String[]{"dwarf", "short", "small", "enano", "bajo", "bajito", "pequeño"};
                EditText answer = (EditText) findViewById(R.id.editTextAnswer);
                //    Update the score if the answer contains one elem of validSols
                Score.checkAnswerEditText(answer,Arrays.asList(validSols));

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle2Activity.class);
                startActivity(i);
            }
        });
    }
//
//    public void nextActivity (){
//        Intent i = new Intent(this, Puzzle2Activity.class);
//        startActivity(i);
//    }
    //    Starts activity with the main activity

    //    Starts activity with the main activity

}
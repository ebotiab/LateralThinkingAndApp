package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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
                CheckBox george = (CheckBox) findViewById(R.id.checkBox);
                CheckBox bill = (CheckBox) findViewById(R.id.checkBox2);
                CheckBox henry = (CheckBox) findViewById(R.id.checkBox5);
                if (george.isChecked() && bill.isChecked() && henry.isChecked()){
                    Score.results++;
                }

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle6Activity.class);
                startActivity(i);
            }
        });
    }
}
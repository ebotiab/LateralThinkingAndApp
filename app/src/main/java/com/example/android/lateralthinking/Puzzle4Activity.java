package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Puzzle4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle4);

        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CheckBox george = (CheckBox) findViewById(R.id.checkBox);
                CheckBox bill = (CheckBox) findViewById(R.id.checkBox2);
                CheckBox henry = (CheckBox) findViewById(R.id.checkBox5);
                CheckBox anthony = (CheckBox) findViewById(R.id.checkBox3);
                CheckBox fred = (CheckBox) findViewById(R.id.checkBox4);
                if (george.isChecked() && bill.isChecked() && henry.isChecked() && !anthony.isChecked() && !fred.isChecked()){
                    Score.puzResults.set(3, 1);
                }

                //    Starts the activity with the next question of the quiz
                Intent i = new Intent(getApplicationContext(), Puzzle5Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
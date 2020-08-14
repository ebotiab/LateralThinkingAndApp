package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Puzzle6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle6);

        Button nextButton=(Button)findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioAnswerGroup=(RadioGroup) findViewById(R.id.radioGroupAnswer);
                int selectedId = radioAnswerGroup.getCheckedRadioButtonId();

                //    If no RadioButtons have been selected, the button is useless
                if (selectedId != -1){
                    RadioButton radioAnswerButton = (RadioButton) findViewById(selectedId);
                    String answer = (String) radioAnswerButton.getText();

                    //    If the correct RadioButton has been selected, the score is updated
                    if (answer.equals("Both have same quantity of water") || answer.equals("Ambos tienen la misma cantidad de agua")){
                        Score.results++;
                    }

                    //    Starts the activity with the next question of the quiz
                    Intent i = new Intent(getApplicationContext(), Puzzle7Activity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}

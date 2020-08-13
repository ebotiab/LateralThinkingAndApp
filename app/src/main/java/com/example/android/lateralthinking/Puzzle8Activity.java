package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

import static com.example.android.lateralthinking.Score.results;

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

                //    Displays a message with the results of the quiz and a feedback
                String message = displayScoreMessage();
                Toast.makeText(Puzzle8Activity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }

    //    Creates the message to display when the quiz is finished
    private String displayScoreMessage(){
        String scoreMessage = getString(R.string.score_is) + results + "/8\n";

        //        Update the feedback TextView depending of the score obtained
        if (results==8){
            scoreMessage += this.getString(R.string.excellent);
        }else if (results<8 && results>5){
            scoreMessage += this.getString(R.string.very_good);
        }else if (results<5 && results>2){
            scoreMessage += this.getString(R.string.good);
        }else if (results<2 && results>=0){
            scoreMessage += this.getString(R.string.keep_trying);
        }


        return scoreMessage;
    }
}
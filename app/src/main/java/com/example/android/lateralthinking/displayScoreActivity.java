package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class displayScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_score);

//        Update the finalScore TextView with the score obtained
        TextView finalScore = (TextView) findViewById(R.id.finalScore);
        int totalScore = Score.results;
        finalScore.setText(totalScore+"/8");

        //        Update the feedback TextView depending of the score obtained
        TextView feedback = (TextView) findViewById(R.id.feedback);
        if (totalScore==8){
            feedback.setText("EXCELLENT XD");
        }else if (totalScore<8 && totalScore>5){
            feedback.setText("VERY GOOD :)");
        }else if (totalScore<5 && totalScore>2){
            feedback.setText("GOOD");
        }else if (totalScore<2 && totalScore>=0){
            feedback.setText("KEEP TRYING");
        }

    }

//    Return to the principal Menu
    public void returnMenu (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
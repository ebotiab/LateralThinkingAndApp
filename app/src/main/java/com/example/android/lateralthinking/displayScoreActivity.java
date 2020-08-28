package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class displayScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_score);

        //        Update the finalScore TextView with the score obtained
        TextView scoreTextView = (TextView) findViewById(R.id.finalScore);
        int totalScore = Score.computeScore();
        scoreTextView.setText(totalScore+"/7");

        //        Create list with the imageViews id of the puzzles results
        List<Integer> puzListImViews = new ArrayList<Integer>();

        int puz1ImageView = R.id.result_puz1;
        puzListImViews.add(puz1ImageView);

        int puz2ImageView = R.id.result_puz2;
        puzListImViews.add(puz2ImageView);

        int puz3ImageView = R.id.result_puz3;
        puzListImViews.add(puz3ImageView);

        int puz4ImageView = R.id.result_puz4;
        puzListImViews.add(puz4ImageView);

        int puz5ImageView = R.id.result_puz5;
        puzListImViews.add(puz5ImageView);

        int puz6ImageView = R.id.result_puz6;
        puzListImViews.add(puz6ImageView);

        int puz7ImageView = R.id.result_puz7;
        puzListImViews.add(puz7ImageView);

        //        Change the images basing in the user answers
        for(int i=0;i<7;i++){
            ImageView currentPuzImageViews = findViewById(puzListImViews.get(i));
            if (Score.puzResults.get(i)==1){
                currentPuzImageViews.setImageResource(R.drawable.tick);
            }
        }

        //        Update the feedback TextView depending of the score obtained
        TextView feedback = (TextView) findViewById(R.id.feedback);
        if (totalScore==7){
            feedback.setText(R.string.excellent);
        }else if (totalScore<=6 && totalScore>5){
            feedback.setText(R.string.very_good);
        }else if (totalScore<=5 && totalScore>2){
            feedback.setText(R.string.good);
        }else if (totalScore<=2 && totalScore>=0){
            feedback.setText(R.string.keep_trying);
        }
    }

    //    Return to the principal menu
    public void returnMenu (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
package com.example.android.lateralthinking;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;




public class Score {

    public static List<Integer> results = new ArrayList<Integer>();

    public static void addResultEditText(EditText answer, List<String> validSols){
        String answerText = answer.getText().toString();
        if (validSols.contains(answerText)){
            Score.results.add(1);
        }else{
            Score.results.add(0);
        }
    }

    public static int sumScores() {
        int sum = 0;
        for (int i: results) {
            sum += i;
        }
        return sum;
    }
}

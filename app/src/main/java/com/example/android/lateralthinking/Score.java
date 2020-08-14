package com.example.android.lateralthinking;

import android.widget.EditText;

import java.util.List;


public class Score {

    public static int results = 0;

    public static void checkAnswerEditText(EditText answer, List<String> validSols){
        String answerText = answer.getText().toString();
        for (String i: validSols) {
            if (answerText.contains(i)){
                results++;
                return;
            }
        }
    }
}

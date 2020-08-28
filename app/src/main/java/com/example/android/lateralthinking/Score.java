package com.example.android.lateralthinking;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Score {

    public static List<Integer> puzResults;

    public static int computeScore(){
        int sum = 0;
        for (int i: puzResults) {
            sum += i;
        }
        return sum;
    }

    public static void initPuzResults(){
        Integer[] integers = new Integer[7];    // all elements are null
        Arrays.fill(integers, 0);
        List<Integer> list = Arrays.asList(integers);
        puzResults = list;
    }

    public static void checkAnswerEditText(EditText answer, List<String> validSols, int numPuzzle){
        String answerText = answer.getText().toString();
        for (String i: validSols) {
            if (answerText.contains(i)){
                puzResults.set(numPuzzle-1, 1);
                return;
            }
        }
    }
}

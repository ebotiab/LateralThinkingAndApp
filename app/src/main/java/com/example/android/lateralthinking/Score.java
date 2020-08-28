package com.example.android.lateralthinking;

import android.widget.EditText;

import java.util.Arrays;
import java.util.List;


public class Score {

    public static List<Integer> puzResults;

    //    Initialize the list of puzzles results to a list of seven zeroes
    public static void initPuzResults(){
        Integer[] integers = new Integer[7];    // all elements are null
        Arrays.fill(integers, 0);
        List<Integer> list = Arrays.asList(integers);
        puzResults = list;
    }

    //    Compute the score using the list of puzzles results
    public static int computeScore(){
        int sum = 0;
        for (int i: puzResults) {
            sum += i;
        }
        return sum;
    }

    //    Update the list of puzzles results if the user answer is correct
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

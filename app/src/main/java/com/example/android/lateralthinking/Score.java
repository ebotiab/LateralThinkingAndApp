package com.example.android.lateralthinking;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;



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
}

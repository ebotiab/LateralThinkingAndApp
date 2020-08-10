package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class Puzzle3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle3);

        Button nextButton=(Button)findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioAnswerGroup=(RadioGroup) findViewById(R.id.radioGroupAnswer);
                int selectedId = radioAnswerGroup.getCheckedRadioButtonId();
                if (selectedId == -1){
                    return;
                }
                RadioButton radioAnswerButton = (RadioButton) findViewById(selectedId);
                String answer = (String) radioAnswerButton.getText();
                if (answer.equals("Door in the right") || answer.equals("Puerta de la derecha")){
                    Score.results.add(1);
                }
                Intent i = new Intent(getApplicationContext(), Puzzle4Activity.class);
                startActivity(i);
            }
        });
    }

}

//                Intent intent = new Intent(getApplicationContext(), Puzzle4Activity.class);
//                intent.putExtra("results", (Parcelable) score);

//                startActivity(intent);

package com.example.android.lateralthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Puzzle6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle6);

        TextView title = (TextView) findViewById(R.id.textView);
        title.setText(String.valueOf(Score.results));

        Button nextButton=(Button)findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioAnswerGroup=(RadioGroup) findViewById(R.id.radioGroupAnswer);
                int selectedId = radioAnswerGroup.getCheckedRadioButtonId();
                RadioButton radioAnswerButton = (RadioButton) findViewById(selectedId);
                if (radioAnswerButton.getText()=="Both have same quantity of water"){
                    Score.results.add(1);
                }else{
                    Score.results.add(0);
                }
                Intent i = new Intent(getApplicationContext(), Puzzle7Activity.class);
                startActivity(i);
            }
        });

    }
}

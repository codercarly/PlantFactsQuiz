package com.example.android.plantfactsquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submitQuiz(View view) {

        // Get User Answers
        RadioButton question1 = findViewById(R.id.Q1Correct);
        RadioButton question2 = findViewById(R.id.Q2Correct);
        RadioButton question3 = findViewById(R.id.Q3Correct);
        EditText question4 = findViewById(R.id.Q4Answer);
        String q4 = question4.getText().toString();
        RadioButton question5 = findViewById(R.id.Q5Correct);
        RadioButton question6 = findViewById(R.id.Q6Correct);
        RadioButton question7 = findViewById(R.id.Q7Correct);
        CheckBox question8_a = findViewById(R.id.Q8CorrectA);
        CheckBox question8_b = findViewById(R.id.Q8CorrectB);
        CheckBox question8_c = findViewById(R.id.Q8CorrectC);
        EditText question9 = findViewById(R.id.Q9Answer);
        String q9 = question9.getText().toString();
        RadioButton question10 = findViewById(R.id.Q10Correct);

        // Grade Quiz
        if (question1.isChecked()) { // Question 1
            score += 1;
        }
        if (question2.isChecked()) { // Question 2
            score += 1;
        }
        if (question3.isChecked()) { // Question 3
            score += 1;
        }
        if (q4.equals("Brazil")) { // Question 4
            score += 1;
        }
        if (question5.isChecked()) { // Question 5
            score += 1;
        }
        if (question6.isChecked()) { // Question 6
            score += 1;
        }
        if (question7.isChecked()) { // Question 7
            score += 1;
        }
        if (question8_a.isChecked() && question8_b.isChecked() && question8_c.isChecked()) { // Question 8
            score += 1;
        }
        if (q9.equals("Fruit")) { // Question 9
            score += 1;
        }
        if (question10.isChecked()) { // Question 10
            score += 1;
        }
        // Score Quiz
        if (score == 10) {
            Toast.makeText(this, "You have a perfect score! This is why your Mom thinks you're a winner!", Toast.LENGTH_LONG).show();
        } else if (score == 9) {
            Toast.makeText(this, "You missed 1! Don't disappoint your Mom, be perfect!", Toast.LENGTH_LONG).show();
        } else if (score >= 6) {
            Toast.makeText(this, "Um, you've missed a couple. Mom's very disappointed in you.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Yikes, your score is terrible! Where's my red pen!? Mom doesn't know where she went wrong with you.", Toast.LENGTH_LONG).show();
        }

    }

}

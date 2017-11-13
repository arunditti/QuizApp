package com.arunditti.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkQ1Answer() {
        CheckBox checkBox1Q1 = (CheckBox) findViewById(R.id.Q1_A_checkbox);
        boolean isCheckBox1Q1Checked = checkBox1Q1.isChecked();
        CheckBox checkBox2Q1 = (CheckBox) findViewById(R.id.Q1_B_checkbox);
        boolean isCheckBox2Q1Checked = checkBox2Q1.isChecked();
        CheckBox checkBox3Q1 = (CheckBox) findViewById(R.id.Q1_C_checkbox);
        boolean isCheckBox3Q1Checked = checkBox3Q1.isChecked();
        CheckBox checkBox4Q1 = (CheckBox) findViewById(R.id.Q1_D_checkbox);
        boolean isCheckBox4Q1Checked = checkBox4Q1.isChecked();
        if(isCheckBox1Q1Checked && !isCheckBox2Q1Checked && !isCheckBox3Q1Checked && !isCheckBox4Q1Checked){
            score = score + 1;
        }
    }

    private String getQ2AnswerInput() {
        EditText editTextAnswerField = (EditText) findViewById(R.id.Q2_answer_textfield);
        String answerQ2 = editTextAnswerField.getText().toString();
        return answerQ2;
    }

    private void checkQ2Answer() {
        String answerQ2 = getQ2AnswerInput();
        if(answerQ2.equals("12")) {
            score = score +1;
        }
    }

    private void checkQ3Answer() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.yes_radio_button);
        boolean isRadioButton1Q2Checked = radioButton.isChecked();
        if(isRadioButton1Q2Checked){
            score = score +1;
        }
    }

    private void checkAllQuestions() {
        checkQ1Answer();
        checkQ2Answer();
        checkQ3Answer();
    }

    private void resetScore() {
        score = 0;
    }

    public void submitAnswers(View view) {
        checkAllQuestions();
        Toast.makeText(this, "Your score is : " + score + "/3", Toast.LENGTH_LONG).show();
        resetScore();
    }

    public void resetQuiz(View view) {

    }

}

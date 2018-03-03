package com.example.android.quizapp;

import android.app.Activity;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.R;


public class MainActivity extends AppCompatActivity {

    int driveResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                EditText userNameField = (EditText) findViewById(R.id.nameField);
                String userName = userNameField.getText().toString();

                EditText answerTextField = (EditText) findViewById(R.id.answerField);
                String answerField = answerTextField.getText().toString();

                String answerSix = getResources().getString(R.string.sixAnsthree);

                if (answerField.equals(answerSix)) {

                    driveResult++;
                }


                if (driveResult <= 2) {

                    Toast.makeText(getApplicationContext(),
                            userName + " " + "your score is " + " " + driveResult + " " + "you are bed driver!", Toast.LENGTH_LONG).show();
                } else if (driveResult <= 3) {

                    Toast.makeText(getApplicationContext(),
                            userName + " " + "your score is " + " " + driveResult + " " + "you are good driver!", Toast.LENGTH_LONG).show();
                } else if (driveResult <= 6) {

                    Toast.makeText(getApplicationContext(),
                            userName + " " + "your score is " + " " + driveResult + " " + "you are best driver!", Toast.LENGTH_LONG).show();

                }
            }
        });
    }



    public void onRadioButtonClickedOne(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiofirstAnsOne:
                if (checked)
                    driveResult++;
                break;
        }
    }

    public void onCheckboxClickedOne(View view) {
        // Is the view now checked?
        CheckBox checkBoxAnsA = findViewById(R.id.checkboxSecondAnsOne);
        CheckBox checkBoxAnsB = findViewById(R.id.checkboxSecondAnsTwo);

        if (checkBoxAnsA.isChecked() && checkBoxAnsB.isChecked()) {
            driveResult++;
        }
    }

    public void onRadioButtonClickedTwo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioThirdAnsOne:
                if (checked)
                    driveResult++;
                break;
        }
    }

    public void onRadioButtonClickedThree(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioFourAnsOne:
                if (checked)
                    driveResult++;
                break;
        }
    }

    public void onRadioButtonClickedFour(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioFiveAnsOne:
                if (checked)
                    driveResult++;
                break;
        }
    }



}



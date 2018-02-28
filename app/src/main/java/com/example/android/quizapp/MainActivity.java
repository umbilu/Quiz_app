package com.example.android.quizapp;

import android.app.Activity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int driveResult = 5;

    private String getUserName() {
        EditText userInputLastName = (EditText) findViewById(R.id.nameField);
        String name = userInputLastName.getText().toString();
        return name;
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
            case R.id.radiofirstAnsTwo:
                if (checked)
                    driveResult--;
                    break;
            case R.id.radiofirstAnsThree:
                if (checked)
                    driveResult--;
                    break;
        }
    }

    public void onCheckboxClickedOne(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkboxSecondAnsOne:
                if (checked)
                    driveResult++;
                else
                    driveResult--;
                break;
            case R.id.checkboxSecondAnsTwo:
                if (checked)
                    driveResult--;
                else
                    driveResult++;
                break;
            case R.id.checkboxSecondAnsThree:
                if (checked)
                    driveResult--;
                else
                    driveResult++;
                break;

        }
    }

    public void onRadioButtonClickedTwo(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioThirdAnsOne:
                if (checked)
                    driveResult++;
                break;
            case R.id.radioThirdAnsTwo:
                if (checked)
                    driveResult--;
                break;
            case R.id.radioThirdAnsthree:
                if (checked)
                    driveResult--;
                break;
        }
    }

    public void onRadioButtonClickedThree(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioFourAnsOne:
                if (checked)
                    driveResult++;
                break;
            case R.id.radioFourAnsTwo:
                if (checked)
                    driveResult--;
                break;
            case R.id.radiofourAnsThree:
                if (checked)
                    driveResult--;
                break;
        }
    }

    public void onRadioButtonClickedFour(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiofirstAnsOne:
                if (checked)
                    driveResult++;
                break;
            case R.id.radioFiveAnsTwo:
                if (checked)
                    driveResult--;
                break;
            case R.id.radioFiveAnsThree:
                if (checked)
                    driveResult--;
                break;
        }
    }


    Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),
                    "Button Clicked!", Toast.LENGTH_SHORT).show();
        }
    });
}



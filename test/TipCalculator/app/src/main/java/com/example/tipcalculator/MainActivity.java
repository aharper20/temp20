package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tipBox;
    private EditText billBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void convert (View v){

        String input = billBox.getText().toString();
        if(input.length()> 0){
            double tipValue = billBox * 0.2;
            tipBox.setText(String.format("%2f", tipValue))
        }

    }
}

package com.poplar.isun.simplecounterapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Step #1 : Declare a Variable
    Button increment , reset;
    TextView Show;
    EditText setNumber;

    int temp ; // Store the current number
    int number; // Store Values of EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step #2: findViewById to find a child widget with a certain ID
        increment = (Button) findViewById(R.id.btn_increment);
        reset = (Button) findViewById(R.id.btn_reset);
        Show = (TextView)findViewById(R.id.tv_show);
        setNumber = (EditText) findViewById(R.id.et_number);

        temp = 0;
        number = 0;

        setNumber.setText("1");

       }
    //Step #3 :Tracking Button clicks
    public void increment(View v){
        number = Integer.parseInt(setNumber.getText().toString());
        temp = number + temp;
        Show.setText(temp + "");
       increment.setBackgroundColor(Color.BLUE);
    }
    public void reset(View v){
        number = 0;
        temp = 0;
        setNumber.setText("0");
        Show.setText("0");
        increment.setBackgroundColor(Color.GREEN);
    }

}

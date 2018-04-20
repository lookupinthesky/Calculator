package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView one, two, three, four, five, six, seven, eight, nine, zero, divide, multiply, plus, subtract, percentage, signChange, allClear ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (TextView)findViewById(R.id.one );
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView)findViewById(R.id.nine);
        zero = (TextView) findViewById(R.id.zero);
        divide = (TextView)findViewById(R.id.divide);
        multiply = (TextView) findViewById(R.id.multiply);
        plus = (TextView) findViewById(R.id.plus);
        subtract = (TextView) findViewById(R.id.subtract);
        percentage = (TextView)findViewById(R.id.percentage);
        signChange = (TextView) findViewById(R.id.signChange);


        allClear = (TextView) findViewById(R.id.allClear);

    }
}

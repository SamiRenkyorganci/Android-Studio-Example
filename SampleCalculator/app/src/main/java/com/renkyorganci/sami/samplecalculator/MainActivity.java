package com.renkyorganci.sami.samplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a1;
    EditText b2;
    TextView  result;
    int a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         a1 = (EditText) findViewById(R.id.editText4);
        b2 = (EditText) findViewById(R.id.editText5);
         result = (TextView) findViewById(R.id.resultText);

    }

    public void sum(View view){
        a= Integer.parseInt(a1.getText().toString());
        b= Integer.parseInt(b2.getText().toString());

        int resultInt = a + b;

        result.setText("Result: " + resultInt);

    }
    public void deduct(View view){
        a= Integer.parseInt(a1.getText().toString());
        b= Integer.parseInt(b2.getText().toString());

            int resultInt = a - b;
            result.setText("Result: " +  resultInt);



    }
    public void multiply(View view){

        a= Integer.parseInt(a1.getText().toString());
        b= Integer.parseInt(b2.getText().toString());
        int resultInt = a * b;

        result.setText("Result: " + resultInt);

    }
    public void divide(View view){
        a= Integer.parseInt(a1.getText().toString());
        b= Integer.parseInt(b2.getText().toString());

            int resultInt = a / b;
            result.setText("Result: " +  resultInt);



    }

}

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickPlus(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.myInput1);
        EditText secondNumberStr = (EditText) findViewById(R.id.myInput2);
        String str1 = firstNumberStr.getText().toString();
        String str2 = secondNumberStr.getText().toString();
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int input = int1 + int2;
        String rInput = String.valueOf(input);

        goToActivity2(rInput);
    }

    public void clickMinus(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.myInput1);
        EditText secondNumberStr = (EditText) findViewById(R.id.myInput2);
        String str1 = firstNumberStr.getText().toString();
        String str2 = secondNumberStr.getText().toString();
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int input = int1 - int2;
        String rInput = String.valueOf(input);

        goToActivity2(rInput);
    }

    public void clickMultiply(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.myInput1);
        EditText secondNumberStr = (EditText) findViewById(R.id.myInput2);
        String str1 = firstNumberStr.getText().toString();
        String str2 = secondNumberStr.getText().toString();
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int input = int1 * int2;
        String rInput = String.valueOf(input);

        goToActivity2(rInput);
    }

    public void clickDivide(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.myInput1);
        EditText secondNumberStr = (EditText) findViewById(R.id.myInput2);
        String str1 = firstNumberStr.getText().toString();
        String str2 = secondNumberStr.getText().toString();
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int input = int1 / int2;
        String rInput = String.valueOf(input);

        goToActivity2(rInput);
    }

    public void goToActivity2(String i) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",i);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
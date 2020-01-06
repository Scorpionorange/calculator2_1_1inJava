package com.example.calculator2_1_1injava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etInOut = null, etShowInfo = null;
    private Button bt0 = null, bt1 = null, bt2 = null,bt3 = null,
                   bt4 = null, bt5 = null, bt6 = null,
                   bt7 = null, bt8 = null, bt9 = null,
                   btC = null, btEqual = null, btPlus = null, btDec = null;
    private int x = 0, y = 0, result = 0;
    private int sign = 0;
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click();
    }

    private void click(){
        etShowInfo = (EditText) findViewById(R.id.edit2);
        etInOut = (EditText) findViewById(R.id.edit1);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6 = (Button) findViewById(R.id.button6);
        bt7 = (Button) findViewById(R.id.button7);
        bt8 = (Button) findViewById(R.id.button8);
        bt9 = (Button) findViewById(R.id.button9);
        bt0 = (Button) findViewById(R.id.button0);
        btPlus = (Button) findViewById(R.id.buttonPlus);
        btDec = (Button) findViewById(R.id.buttonDec);
        btEqual = (Button) findViewById(R.id.buttonEqual);
        btC = (Button) findViewById(R.id.buttonC);

        String i = Integer.toString(x);
        etInOut.setText(i);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(3);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(4);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(5);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(6);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(7);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(8);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(9);
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settext(0);
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clean();
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setoperator("+");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal();
            }
        });
    }

    private void settext(int input){
        String i = Integer.toString(input);
        if(sign == 0){
            etInOut.setText(i);
            x = input;
            sign = 1;
        } else if (sign == 2){
            etInOut.setText(i);
            y = input;
        }
    }

    private void clean(){
        etInOut.setText("0");
        etShowInfo.setText("");
        x = 0;
        y = 0;
        result = 0;
        sign = 0;
    }

    private void setoperator(String op){
        if(sign == 1 || sign == 0){
            operator = op;
            etShowInfo.setText(etInOut.getText() + op);
            etInOut.setText("");
            sign = 2;
        }
    }

    private void equal(){
        if(operator.equals("+") && sign == 2){
            result = x + y;
            etShowInfo.setText(x + operator + y);
            etInOut.setText("" + result);
            sign = 0;
            operator = "";
            x = result;
        }
    }
}

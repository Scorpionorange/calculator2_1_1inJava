package com.example.calculator2_1_1injava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etInOut = null, etShowInfo = null;
    private Button bt0 = null, bt1 = null, bt2 = null,bt3 = null,
                   bt4 = null, bt5 = null, bt6 = null,
                   bt7 = null, bt8 = null, bt9 = null,
                   btC = null, btEqual = null, btPlus = null;
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
        btPlus = (Button) findViewById(R.id.buttonPlus);
        btEqual = (Button) findViewById(R.id.buttonEqual);
        btC = (Button) findViewById(R.id.buttonC);
    }
}

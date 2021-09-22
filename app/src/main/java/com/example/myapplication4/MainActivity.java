package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue , etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondvalue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                 answer = firstvalue + secondvalue;

                 tvAns.setText("answer is =  " + answer);
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                answer = firstvalue - secondvalue;

                tvAns.setText("answer is =  " + answer);
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                if(firstvalue == 0 || secondvalue == 0 ){
                    answer = 0;
                }

                else {
                    answer = firstvalue * secondvalue;
                }
                    tvAns.setText("answer is =  " + answer);

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstvalue,secondvalue,answer;
                firstvalue = Double.parseDouble(etFirstValue.getText().toString());
                secondvalue = Double.parseDouble(etSecondValue.getText().toString());
                if(firstvalue == 0){
                    answer = 0;
                }
                else {
                    answer = firstvalue / secondvalue;
                }
                tvAns.setText("answer is =  " + answer);
            }
        });


    }
}
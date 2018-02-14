package com.suzhi.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_dot, button_add, button_sub, button_mul, button_div, button_clear, button_equals;
    TextView tv_display;
    String previousString, operation;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapping Button objects with corresponding Views
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);
        button_dot = findViewById(R.id.button_dot);
        button_equals = findViewById(R.id.button_equals);

        //Mapping TextView object with corresponding View
        tv_display = findViewById(R.id.tv_display);


        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append("9");
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.append(".");
            }
        });


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_display.setText("0");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 += Integer.parseInt((String)tv_display.getText());
                tv_display.append("+");
                previousString = (String)tv_display.getText();
                operation = "Add";
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 += Integer.parseInt((String)tv_display.getText());
                tv_display.append("-");
                previousString = (String)tv_display.getText();
                operation = "Sub";
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 += Integer.parseInt((String)tv_display.getText());
                tv_display.append("*");
                previousString = (String)tv_display.getText();
                operation = "Mul";
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 += Integer.parseInt((String)tv_display.getText());
                tv_display.append("/");
                previousString = (String)tv_display.getText();
                operation = "Div";
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Integer.parseInt(((String)tv_display.getText()).substring(previousString.length(), ((String)tv_display.getText()).length()));
                if (operation != null && operation.equals("Add")){
                    result = num1 + num2;
                } else if (operation != null && operation.equals("Sub")){
                    result = num1 - num2;
                } else if (operation != null && operation.equals("Mul")){
                    result = num1 * num2;
                } else if (operation != null && operation.equals("Div")){
                    result = num1 / num2;
                }
                tv_display.setText(result);

                //Reinitializing the previousString variable after calculation is completed
                previousString = null;
                operation = null;
                num1 = 0;
                num2 = 0;
            }
        });
    }
}
package com.suzhi.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_dot, button_add, button_sub, button_mul, button_div, button_clear, button_equals;
    TextView tv_display;
    String previousString, operation;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"calculator-log: Inside onCreate Method");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        button_clear = findViewById(R.id.button_clear);
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
                Log.d(TAG,"calculator-log: Button '0' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("0");
            }
        });

       button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '1' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '2' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '3' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '4' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '5' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '6' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '7' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '8' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '9' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append("9");
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '.' is clicked");
                if (operation != null && operation.equals("Equals")) {
                    tv_display.setText("");
                    operation = null;
                }
                tv_display.append(".");
            }
        });


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button 'CLEAR' is clicked");
                tv_display.setText("0");

                //Reinitializing the previousString variable if "CLEAR" button is clicked
                previousString = null;
                operation = null;
                num1 = 0;
                num2 = 0;
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '+' is clicked");
                num1 += Integer.parseInt(tv_display.getText().toString());
                previousString = tv_display.getText().toString();
                tv_display.append("+");
                operation = "Add";
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '-' is clicked");
                num1 += Integer.parseInt(tv_display.getText().toString());
                previousString = tv_display.getText().toString();
                tv_display.append("-");
                operation = "Sub";
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '*' is clicked");
                num1 += Integer.parseInt(tv_display.getText().toString());
                previousString = tv_display.getText().toString();
                tv_display.append("*");
                operation = "Mul";
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '/' is clicked");
                num1 += Integer.parseInt(tv_display.getText().toString());
                previousString = tv_display.getText().toString();
                tv_display.append("/");
                operation = "Div";
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"calculator-log: Button '=' is clicked");
                if (operation != null) {
                    num2 = Integer.parseInt(tv_display.getText().toString().substring(previousString.length() + 1, tv_display.getText().toString().length()));
                    if (operation.equals("Add")){
                        result = num1 + num2;
                    } else if (operation.equals("Sub")){
                        result = num1 - num2;
                    } else if (operation.equals("Mul")){
                        result = num1 * num2;
                    } else if (operation.equals("Div")){
                        result = num1 / num2;
                    }
                    Log.d(TAG,"calculator-log: result: " + result);
                    tv_display.setText(String.valueOf(result));

                    //Reinitializing the previousString variable after calculation is completed
                    previousString = null;
                    operation = "Equals";
                    num1 = 0;
                    num2 = 0;
                }
            }
        });


    }
}
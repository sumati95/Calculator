package com.doselect.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, point, delete, clear, add, subtract, multiply, divide, equal;
    EditText text;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zero = (Button) findViewById(R.id.zero);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button point = (Button) findViewById(R.id.point);
        Button delete = (Button) findViewById(R.id.delete);
        Button clear = (Button) findViewById(R.id.clear);
        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        final Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);
        Button equal = (Button) findViewById(R.id.equal);
        final EditText text = (EditText) findViewById(R.id.text);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null){
                    text.setText("");
                }else {
                    Value1 = Float.parseFloat(text.getText() + "");
                    mAddition = true;
                    text.setText(null);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(text.getText() + "");
                mSubtract = true ;
                text.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(text.getText() + "");
                mMultiplication = true ;
                text.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(text.getText()+"");
                mDivision = true ;
                text.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(text.getText() + "");

                if (mAddition == true){

                    text.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    text.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    text.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    text.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                Value1 = 0;
                Value2 = 0;
            }
        });
    }
}

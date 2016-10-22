package com.example.asama.apphuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    String headerText;
    String numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int mode = intent.getIntExtra("mode", -1);
        setHeader(mode);
        numbers = randomNumber(mode);

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(numbers);

        TextView tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(headerText);
    }

    private void setHeader(int mode) {
        if(mode == 0) {
            headerText = "เลขท้าย 2 ตัว";
        }
        else {
            headerText = "เลขท้าย 3 ตัว";
        }
    }

    private String randomNumber(int mode) {
        if(mode == 0) {
            int number = (int) (Math.random()*100);
            String tmpNumber = String.valueOf(number);
            if(tmpNumber.length() == 1) {
                return "0" + tmpNumber;
            }
            else {
                return tmpNumber;
            }

        }
        else {
            int number = (int) (Math.random()*1000);
            String tmpNumber = String.valueOf(number);
            if(tmpNumber.length() == 1) {
                return "00" + tmpNumber;
            }
            else if(tmpNumber.length() == 2) {
                return "0" + tmpNumber;
            }
            else {
                return tmpNumber;
            }
        }
    }
}

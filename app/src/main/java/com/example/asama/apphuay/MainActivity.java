package com.example.asama.apphuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int mode;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button twoNumbers = (Button) findViewById(R.id.button3);
        twoNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = 0;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("mode", mode);
                startActivity(intent);
            }
        });

        Button threeNumbers = (Button) findViewById(R.id.button4);
        threeNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = 1;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("mode", mode);
                startActivity(intent);
            }
        });

    }
}

package com.wuisabella.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button add_button;
    Button color_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textBox);
        add_button = findViewById(R.id.button1);
        color_button = findViewById(R.id.button2);

        add_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("add_button clicked");
                Log.i("add_button", "hello");

                int num = Integer.parseInt(text.getText().toString()) + 1;
                text.setText("" + num);
            }
        });

        color_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("color_button clicked");
                Log.i("color_button", "hi");

                color_button.setBackgroundColor(Color.parseColor(random_color()));
            }
        });
    }

    public String random_color(){
        Random obj = new Random();
        int rand = obj.nextInt(0xffffff + 1);
        String color = String.format("#%06x", rand);
        System.out.println(color);
        return color;
    }
}

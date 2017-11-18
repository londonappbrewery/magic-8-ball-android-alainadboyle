package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AskButton;
        AskButton = (Button) findViewById(R.id.Askbutton);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.imageView);
        
        final int[] ballArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic 8 Ball", "You rolled the ball!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);

                Log.d("Dicee", "The answer is" + number);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
}}

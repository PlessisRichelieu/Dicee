package com.example.niki.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton;

        Map <String, Integer> map = new HashMap<>();
        

        rollButton =  findViewById(R.id.bRoll);

        final ImageView leftDie = (ImageView) findViewById(R.id.leftDie);

        final ImageView rightDie = (ImageView) findViewById(R.id.rightDie);

        final int [] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};





        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rNumGen = new Random ();

                int number = rNumGen.nextInt(6);
                leftDie.setImageResource(diceArray[number]);
                number = rNumGen.nextInt(6);
                rightDie.setImageResource(diceArray[number]);
            }
        });

    }
}
package com.example.myapplicationmsk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private
    //package acces
    //protected
    //public

    Cat myCat;
    int z;
    Cat murzik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat ();
        Log.i("numOfLeg", "cat1 num of leg: " + cat1.numOfLeg);


    }
}
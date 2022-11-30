package com.example.myapplicationmsk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        z = z++;



        Cat vaska = new Cat();
        vaska.talk("Meow, meow!");


        Cat murzik = new Cat(2, "Murzik");
        murzik.talk();


        Puma bagira = new Puma();
        bagira.talk();

        Cat puma = new Puma();
        puma.talk();

        Cat Simba = new Lion();
        murzik.talk();


    }

    void method(double x, int y) {
        int a;
        a = 1;
        a = y + 1;
        double d = x * 2;
        z = a + y;
    }

    void method1() {
        int a;
        a = 1;

    }
}
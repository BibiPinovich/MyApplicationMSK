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

        z = z++;



        Cat vaska = new Cat();

        Cat murzik = new Cat(2, "Murzik");

        Puma bagira = new Puma();

        Cat puma = new Puma();

        Cat Simba = new Lion();

        Lion lion = new Lion();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(vaska);
        cats.add(bagira);
        cats.add(puma);
        cats.add(Simba);
        cats.add(lion);

        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);
        Cat cat4 = cats.get(4);

        Puma puma1 = (Puma)cats.get(1);
        puma1.talk();

        Cat cat5 = cats.get(4);
        if (cat5 instanceof Puma) {
            Puma puma2 = (Puma) cat5;
            puma2.talk();
        } else {
         Log.i("instanceof", "This is not Puma");
        }

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
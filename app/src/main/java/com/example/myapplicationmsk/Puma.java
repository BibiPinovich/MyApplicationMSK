package com.example.myapplicationmsk;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable {
    private String pumaHellowText;


    @Override
    public void draw() {
        Log.i("draw()", "Draw puma");
    }

    @Override
    public void move() {
        Log.i("move()", "Move overridden puma");
    }

    @Override
    public void print() {
        Log.i("print()", "Print puma");

    }
}

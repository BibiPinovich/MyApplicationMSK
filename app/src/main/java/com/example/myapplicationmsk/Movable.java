package com.example.myapplicationmsk;

import android.util.Log;

public interface Movable {
    default void move(){
        Log.i("move()", "Move puma");

    }
    static void someMethod(){
        Log.i("someMove()", "someMove puma");

    }
}

package com.example.myapplicationmsk;

import android.util.Log;

public class Lion extends  Cat{
    public Lion(){
        super();
        Log.i("Construcrot", "Constructor Lion");
    }


    public static String whatCatsLike(){
        return "I'm Lion and I like playing, jumping and sometimes scratching";
    }

    @Override
    public void draw() {

    }
}

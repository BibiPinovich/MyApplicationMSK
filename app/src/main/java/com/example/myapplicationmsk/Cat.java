package com.example.myapplicationmsk;

import android.util.Log;

//Inner class
//Static inner class
//Local class
//Anonymous class

import java.security.PrivateKey;

public class Cat extends Animal {
    private int age;
    String name;
    final static int numOfLeg = 4;
    private int color;
    private int breed;
    static int cout = 0;

    String helloText;
    CatMood catMood;

    class CatMood{
        int levelOfMood;

        CatMood() {
            if(Cat.this.age < 2) {
                levelOfMood = 100;
            } else if (Cat.this.age >= 2 && Cat.this.age < 7){
                levelOfMood = 50;
            } else if (Cat.this.age >= 7) {
                levelOfMood = 20;
            }

        }
    }


    public Cat() {
        this.age = 1;
        this.name = "John Cena";

        catMood = new CatMood();
        switch (catMood.levelOfMood){
            case 100:
                helloText = "Meow! I'm  happy cat:) My name is " + name + ", and I'm " + age + "years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name + ", and I'm " + age + "years old.";
                break;
            case 20:
                helloText = "Meow! I'm  old and sick happy cat:( My name is " + name + ", and I'm " + age + "years old.";
                break;

        }
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! I'm  happy cat:) My name is " + name + ", and I'm " + age + "years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name + ", and I'm " + age + "years old.";
                break;
            case 20:
                helloText = "Meow! I'm  old and sick happy cat:( My name is " + name + ", and I'm " + age + "years old.";
                break;

        }
    }

    public void talk() {
        Log.i(" talk()", helloText);
    }

    public void talk(int age) {
        Log.i(" talk()", "Meow! I'm" + name + ", and I'm " + age + "years old.");
    }

    public void talk(String hello) {
        Log.i(" talk()", "Meow!" + hello + "meow");
    }

    public static String whatCatslike() {
        return "I like playing, jumping and sometimes scratching";
    }
}
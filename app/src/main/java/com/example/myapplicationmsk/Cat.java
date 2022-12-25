package com.example.myapplicationmsk;
import android.util.Log;

//Inner class
//Static inner class
//Local class
//Anonymous class

public class Cat extends Animal{
    int age;
    String name;
    private String color;
    private String breed;
    final static int numberOfLegs= 4;
    static int count = 0;

    String helloText;
    CatMood catMood;

    class CatMood{
        int levelOfMood;

        CatMood() {
            if(Cat.this.age < 2){
                levelOfMood = 100;
            }else if(Cat.this.age >= 2 && Cat.this.age < 7) {
                levelOfMood = 50;
            }else if (Cat.this.age >= 7) {
                levelOfMood = 20;
            }
        }
    }
    public Cat()  {
        this.name = "John Cena";
        this.age = 1;

        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! Im young and happy cat!:) My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! Im happy cat! My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! Im old and sick cat:( My name is " + name + ", and i`m " + age + " years old.";
                break;

        }

    }
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;

        catMood = new CatMood();


    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! Im young and happy cat!:) My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! Im happy cat! My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! Im old and sick cat:( My name is " + name + ", and i`m " + age + " years old.";
                break;

        }
    }


    public void talk(){
        Log.i("talk()",  helloText);
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
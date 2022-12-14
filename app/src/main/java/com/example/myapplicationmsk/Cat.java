package com.example.myapplicationmsk;

import android.util.Log;

//DA_DA_YA
//Inner class
//Static inner class
//Local class
//Anonymous class

import java.security.PrivateKey;

    public abstract class Cat extends Animal {
        private int age;
        String name;
        private int color;
        private int breed;
        final static int numOfLeg = 4;
        static int count = 0;




    String helloText;
    CatMood catMood;

    static class  CountResetter{
        boolean moreThan100;

        CountResetter(){
            if(Cat.count > 5){
                moreThan100 = true;
            }
            if(moreThan100){
                resetCounter(0);
            }
        }
        void resetCounter(int value){
            Cat.count = value;
        }

    }

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
    public Cat(){
        this.name = "John Cena";
        this.age = 1; {

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
    }
    public Cat(String color, String breed) {

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
    public void talk(int age){
        Log.i("talk()", "Meow! i`m " + age + " years old.");
    }

    public void talk(String hello){ Log.i("talk()", "Meow! " + hello);
    }
    public static String whatCatsLike(){
        return "i like playing, jumping and sometimes scratching";
    }



    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;
            }

            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }
        Mouse mouse = new Mouse("white", mouseWeight);

        if(mouse.weight < 1){
            Log.i("cat say ", "I will eat you!" + mouse.mouseVoice());
        }else{
            Log.i("cat say ", "I afraid you!");
        }
    }

}

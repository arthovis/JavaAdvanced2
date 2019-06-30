package com.DogandCat;

public class Cat extends Animal {
    private boolean hasFur;
    private int noEyes;

    @Override
    public String yieldVoice(){
        return "Miau";
    }
}

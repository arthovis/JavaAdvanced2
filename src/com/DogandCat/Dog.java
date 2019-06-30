package com.DogandCat;

public class Dog extends Animal {
    private String size;
    private String breed;

    @Override
    public String yieldVoice(){
        return "Ham";
    }
}

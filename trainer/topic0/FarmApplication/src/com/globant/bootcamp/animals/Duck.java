package com.globant.bootcamp.animals;

import com.globant.bootcamp.abstracts.Bird;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Aquatic;

public class Duck extends Bird implements Aquatic {

    public Duck(Gender gender) {
        super(gender);
    }
    
    public Duck() {
    	super();
    }

    @Override
    public void swing() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public Egg gaveBirth() {
        return new Egg(new Duck());
    }

    @Override
    public void makeSound() {
        System.out.println("Quack Quack Quack...");
    }
}

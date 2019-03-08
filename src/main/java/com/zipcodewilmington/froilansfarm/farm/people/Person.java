package com.zipcodewilmington.froilansfarm.farm.people;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.Chicken;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.rideables.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Person implements Eater, NoiseMaker {
    private List<Edible> eaten = new ArrayList<Edible>();
    public void eat(List<Edible> food) {
        eaten.addAll(food);
    }
    public List<Edible> getEaten() {
        return eaten;
    }
    public String makeNoise() {
        return "Hi";
    }


    public void getEggs() {
        Farm farm = Farm.getInstance();
        for(ChickenCoop chickenCoop: farm.getChickenCoops())
            for (Chicken chicken: chickenCoop.getAll()) {
                farm.storeInFridge(chicken.yield());
        }
    }
    private static Person anonymous = new Person(){};

    public  static Person getAnonymous() {return anonymous;};

}

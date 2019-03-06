package com.zipcodewilmington.froilansfarm.farm.people;

import com.zipcodewilmington.froilansfarm.farm.rideables.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Eater, NoiseMaker {

    private List<Edible> eaten = new ArrayList<Edible>();

    public void eat(Edible food) {
        eaten.add(food);
    }

    public List<Edible> getEaten() {
        return eaten;
    }

    public String makeNoise() {
        return "Hi";
    }
}

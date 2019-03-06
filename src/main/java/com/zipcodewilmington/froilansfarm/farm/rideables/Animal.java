package com.zipcodewilmington.froilansfarm.farm.rideables;

import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Animal implements Eater, NoiseMaker {
    private List<Edible> eaten = new ArrayList<Edible>();

    public void eat(List<Edible> food) {
        eaten.addAll(food);
    }

    public List<Edible> getEaten() {
        return eaten;
    }

    public String makeNoise() {
        return null;
    }

}

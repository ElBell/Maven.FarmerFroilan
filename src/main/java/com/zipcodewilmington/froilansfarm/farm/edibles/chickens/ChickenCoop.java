package com.zipcodewilmington.froilansfarm.farm.edibles.chickens;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickens = new ArrayList<Chicken>();

    public ChickenCoop(int numberOfChickens) {
        for (int i = 0; i < numberOfChickens; i++) {
            addChicken(new Chicken());
        }
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }
}

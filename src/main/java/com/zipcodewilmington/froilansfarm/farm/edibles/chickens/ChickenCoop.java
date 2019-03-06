package com.zipcodewilmington.froilansfarm.farm.edibles.chickens;

import com.zipcodewilmington.froilansfarm.farm.utilities.Storage;

public class ChickenCoop extends Storage<Chicken> {

    public ChickenCoop(int numberOfChickens) {
        for (int i = 0; i < numberOfChickens; i++) {
            store(new Chicken());
        }
    }
}

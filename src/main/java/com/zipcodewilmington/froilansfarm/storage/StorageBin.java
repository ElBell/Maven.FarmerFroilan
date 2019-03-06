package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

import java.util.List;

public abstract class StorageBin<T extends Edible> {
    private List<T> edibles;

    public StorageBin() {

    }


    public void store(T edible) {
        edibles.add(edible);
    }
}

package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import com.zipcodewilmington.froilansfarm.farm.utilities.Storage;

import java.util.List;

public class Stable extends Storage<Horse> {

    public Stable(int numberOfHorses){
        for (int i = 0; i < numberOfHorses; i++) {
            store(new Horse());

        }
    }

    @Override
    public List<Horse> getAll() {
        return super.getAll();
    }
}

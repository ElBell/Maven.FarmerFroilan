package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import com.zipcodewilmington.froilansfarm.farm.utilities.Storage;

public class Stable extends Storage<Horse> {

    public Stable(int numberOfHorses){
        for (int i = 0; i < numberOfHorses; i++) {
            store(new Horse());
        }
    }

}

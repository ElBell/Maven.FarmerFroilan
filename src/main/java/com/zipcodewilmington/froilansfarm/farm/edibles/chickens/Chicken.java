package com.zipcodewilmington.froilansfarm.farm.edibles.chickens;

import com.zipcodewilmington.froilansfarm.farm.rideables.Animal;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String makeNoise() {
        return "ChaChiChaChiChaChi";
    }

    public EdibleEgg yield() {
        if(!hasBeenFertilized) {
            return new EdibleEgg();
        }
        return null;
    }
}

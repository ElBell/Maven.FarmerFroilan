package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

public class Chaff extends Crop {
    public Wheat yield() {
        if (isHasBeenFertilized() && !isHasBeenHarvested()) {
            return new Wheat();
        }
        return null;
    }
}

package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

public class TomatoPlant extends Crop{
    public Tomato yield() {
        if (isHasBeenFertilized() && !isHasBeenHarvested()) {
            return new Tomato();
        }
        return null;
    }
}

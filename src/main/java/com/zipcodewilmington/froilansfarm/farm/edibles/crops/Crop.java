package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Produce;

public abstract class Crop implements Produce {
    private boolean hasBeenHarvested = false;
    private boolean hasBeenFertilized = false;

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
}

package com.zipcodewilmington.froilansfarm.farm.people;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rider;

public class Farmer extends Person implements Eater, Rider, Botanist {
    private Rideable rideable = null;
    public Rideable getRideable() { return rideable; }

    public void mount(Rideable rideable) {
        this.rideable = rideable;
    }
    public void dismount() {
        this.rideable = null;
    }

    @Override
    public String makeNoise() {
        return "E I E I O";
    }

    public void plant(CropRow cropRow) {
        for (Crop crop: cropRow.getAll()) {
            crop.setHasBeenHarvested(false);
        }
    }

}

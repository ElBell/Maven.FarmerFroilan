package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Botanist;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rider;

public class Farmer extends Person implements Eater, Rider, Botanist {
    private Farm farm;

    private Rideable rideable = null;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public Rideable getRideable() { return rideable; }

    public void mount(Rideable rideable) {
        this.rideable = rideable;
    }
    public void dismount(Rideable aircraft) {
        this.rideable = null;
    }

    @Override
    public String makeNoise() {
        return "E I E I O";
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
    }

}

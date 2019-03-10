package com.zipcodewilmington.froilansfarm.farm.days;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;

public class PlantDay extends Day {
    @Override
    public void run() {
        haveBreakfast();
        plantingCrops();
        System.out.println(farm.getFridge().toString() + "Savings: " + farm.getSavings());
    }

    private void plantingCrops() {
        System.out.println("Froilan's planting his crops");
        for (CropRow cropRow: farm.getField().getAll()) {
                froilan.plant(cropRow);
        }
    }
}

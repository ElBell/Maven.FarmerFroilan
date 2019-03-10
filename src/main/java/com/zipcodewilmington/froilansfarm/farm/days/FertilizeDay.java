package com.zipcodewilmington.froilansfarm.farm.days;

import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.CropDuster;

public class FertilizeDay extends Day {
    private CropDuster cropDuster = (CropDuster) farm.getGarage().getCropDuster();

    private void fertilizingCrops() {
        //Had to make cropDuster implements Rideable
        froilanda.mount(cropDuster);
        cropDuster.fly();
        cropDuster.operate(farm);
        froilanda.dismount();
    }

    @Override
    public void run() {
        haveBreakfast();
        fertilizingCrops();
        froilan.getEggs();
        System.out.println(farm.getFridge());
    }
}

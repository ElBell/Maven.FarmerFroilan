package com.zipcodewilmington.froilansfarm.farm.days;

import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.Tractor;

public class HarvestDay extends Day {
    private Tractor tractor = (Tractor) farm.getGarage().getTractor();

    @Override
    public void run() {
        haveBreakfast();
        harvestingCrops();
        froilanda.getEggs();
        System.out.println(farm.getFridge().toString() + "Savings: " + farm.getSavings());
    }

    private void harvestingCrops() {
        System.out.println("What a beautiful harvest");
        froilan.mount(tractor);
        tractor.operate(farm);
        froilan.dismount();
    }
}

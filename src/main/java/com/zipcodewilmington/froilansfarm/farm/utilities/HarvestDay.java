package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.Tractor;

public class HarvestDay implements Day {
    private Farm farm = Farm.getINSTANCE();
    private Farmer farmer = (Farmer) farm.getFarmHouse().getPerson("Froilan");
    private Tractor tractor = (Tractor) farm.getGarage().getTractor();
    @Override
    public void run() {

    }
}

package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.people.Person;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.Tractor;

public class HarvestDay implements Day {
    private Farm farm = Farm.getINSTANCE();
    private Farmer froilan = (Farmer) farm.getFarmHouse().getPerson("Froilan");
    private Person froilanda = farm.getFarmHouse().getPerson("Froilanda");
    private Tractor tractor = (Tractor) farm.getGarage().getTractor();
    @Override
    public void run() {
        froilan.mount(tractor);
        tractor.operate(farm);
        froilan.dismount();

    }
}

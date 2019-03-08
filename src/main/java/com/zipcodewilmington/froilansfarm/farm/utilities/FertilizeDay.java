package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Horse;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.CropDuster;

import java.util.List;

public class FertilizeDay extends Day {
    private Farm farm = Farm.getInstance();
    private Farmer froilan = (Farmer) farm.getFarmHouse().getPerson("Froilan");
    private Pilot froilanda = (Pilot) farm.getFarmHouse().getPerson("Froilanda");
    private CropDuster cropDuster = (CropDuster) farm.getGarage().getCropDuster();


    public void froilandaFertilizingCrops() {
        //Had to make cropDuster implements Rideable
        froilanda.mount(cropDuster);
        cropDuster.fly();
        cropDuster.operate(farm);
        froilanda.dismount();
    }

    @Override
    public void run() {
        haveBreakfast();
        froilandaFertilizingCrops();
        froilan.getEggs();
        System.out.println(farm.getFridge());
    }
}

package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {

    public Edible harvest(Crop crop){
        Edible edible = crop.yield();
        crop.setHasBeenHarvested(true);
        crop.setHasBeenFertilized(false);

        return edible; }


    public void operate(Farm farm) {
        for(CropRow cropRow: farm.getField().getAll()) {
            for(Crop crop: cropRow.getAll()) {
                farm.storeInFridge(harvest(crop));
            }
        }
    }

}

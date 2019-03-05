package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Tractor extends Vehicle implements FarmVehicle {

    //public Edible harvest(Crop crop){ return crop.yield(); }
    public Edible harvest(Crop crop){ return crop.yield(); }

    public void operate(Farm farm) {
        }
}

package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.edibles.Field;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Chaff;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import com.zipcodewilmington.froilansfarm.farm.people.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;

import java.util.ArrayList;
import java.util.List;

public class ThePlot {
    private static final Farm farm = new Farm();

    public static void main(String[] args) {
        farm.populateField();
        farm.populateChickenCoops();
        farm.populateStables();
        farm.populateFarmHouse();
    }


}

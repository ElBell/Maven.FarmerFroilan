package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.edibles.Field;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Chaff;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import com.zipcodewilmington.froilansfarm.people.FarmHouse;
import com.zipcodewilmington.froilansfarm.people.Farmer;

import java.util.ArrayList;
import java.util.List;

public class ThePlot {
    private static final Farm farm = new Farm();

    public static void main(String[] args) {
        farm.setFields(populateField());
        farm.setChickenCoops(populateChickenCoops());
        farm.setStables(populateStables());
        farm.setFarmHouse(populateFarmHouse());
    }

    private static Field populateField() {
        Field field = new Field();
        field.addCropRow(new CropRow(CornStalk::new));
        field.addCropRow(new CropRow(TomatoPlant::new));
        field.addCropRow(new CropRow(Chaff::new));
        field.addCropRow(new CropRow(TomatoPlant::new));
        field.addCropRow(new CropRow(CornStalk::new));
        return field;
    }

    private static List<ChickenCoop> populateChickenCoops() {
        List<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(3));
        return chickenCoops;
    }

    private static List<Stable> populateStables() {
        List<Stable> stables = new ArrayList<>();
        stables.add(new Stable(3));
        stables.add(new Stable(3));
        stables.add(new Stable(4));
        return stables;
    }

    private static FarmHouse populateFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addPerson("Froilan", new Farmer(farm));
        farmHouse.addPerson("Froilanda", new Pilot());
        return farmHouse;
    }

}

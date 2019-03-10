package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.edibles.Field;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Chaff;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.Garage;
import com.zipcodewilmington.froilansfarm.farm.people.FarmHouse;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private Field field;
    private FarmHouse farmHouse;
    private Garage garage= new Garage();
    private Fridge fridge = new Fridge();
    private int savings = 0;
    private static Farm INSTANCE = null;


    private Farm() {
        setFarm();
    }

    public void setFarm() {
        populateField();
        populateChickenCoops();
        populateStables();
        populateFarmHouse();
    }

    public void profit(int profit) {
        savings += profit;
    }

    public int getSavings() {
        return savings;
    }

    public static Farm getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Farm();
        }
        return INSTANCE;
    }

    public Field getField() { return field; }

    public void storeInFridge(Edible edible) { fridge.store(edible); }

    public List<Stable> getStables() { return stables; }

    public List<ChickenCoop> getChickenCoops() { return chickenCoops; }

    public FarmHouse getFarmHouse() { return farmHouse; }

    public Garage getGarage() { return garage; }

    public Fridge getFridge() { return fridge; }

    public void setFridge(Fridge fridge) { this.fridge = fridge; }

    private void populateField() {
        Field field = new Field();
        field.store(new CropRow(CornStalk::new));
        field.store(new CropRow(TomatoPlant::new));
        field.store(new CropRow(Chaff::new));
        field.store(new CropRow(TomatoPlant::new));
        field.store(new CropRow(CornStalk::new));
        this.field = field;
    }

    private void populateChickenCoops() {
        List<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(3));
        this.chickenCoops = chickenCoops;
    }

    private void populateStables() {
        List<Stable> stables = new ArrayList<>();
        stables.add(new Stable(3));
        stables.add(new Stable(3));
        stables.add(new Stable(4));
        this.stables = stables;
    }

    private void populateFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addPerson("Froilan", new Farmer());
        farmHouse.addPerson("Froilanda", new Pilot());
        this.farmHouse = farmHouse;
    }

}

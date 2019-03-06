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
    private static Farm INSTANCE = new Farm();

    private Farm() {
        populateField();
        populateChickenCoops();
        populateStables();
        populateFarmHouse();
    }

    public static Farm getINSTANCE() { return INSTANCE; }

    public void setFields(Field field) {
        this.field = field;
    }

    public Field getField() { return field; }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public void setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public void storeInFridge(Edible edible) { fridge.store(edible); }

    public List<Stable> getStables() { return stables; }

    public List<ChickenCoop> getChickenCoops() { return chickenCoops; }

    public void setField(Field field) { this.field = field; }

    public FarmHouse getFarmHouse() { return farmHouse; }

    public Garage getGarage() { return garage; }

    public void setGarage(Garage garage) { this.garage = garage; }

    public Fridge getFridge() { return fridge; }

    public void setFridge(Fridge fridge) { this.fridge = fridge; }

    public void populateField() {
        Field field = new Field();
        field.store(new CropRow(CornStalk::new));
        field.store(new CropRow(TomatoPlant::new));
        field.store(new CropRow(Chaff::new));
        field.store(new CropRow(TomatoPlant::new));
        field.store(new CropRow(CornStalk::new));
        setFields(field);
    }

    public void populateChickenCoops() {
        List<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(3));
        setChickenCoops(chickenCoops);
    }

    public void populateStables() {
        List<Stable> stables = new ArrayList<>();
        stables.add(new Stable(3));
        stables.add(new Stable(3));
        stables.add(new Stable(4));
        setStables(stables);
    }

    public void populateFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addPerson("Froilan", new Farmer());
        farmHouse.addPerson("Froilanda", new Pilot());
        setFarmHouse(farmHouse);
    }

}

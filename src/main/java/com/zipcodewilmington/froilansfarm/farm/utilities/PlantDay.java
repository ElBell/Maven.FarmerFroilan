package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.Field;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.Chicken;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.people.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.people.Person;

public class PlantDay implements Day {

    private Farm theFarm = Farm.getInstance();
    private FarmHouse farmHouse = theFarm.getFarmHouse();
    private Farmer frolian = (Farmer) farmHouse.getPerson("Froilan");
    private Person Froilanda = farmHouse.getPerson("Froilanda");


    @Override
    public void run() {
        System.out.println(theFarm.getFridge());
        plant();
        getTheEgg();
        System.out.println(theFarm.getFridge());
    }

    public void plant() {
        Field theField = theFarm.getField();

        for (CropRow cropRow : theField.getAll()) {
            frolian.plant(cropRow);
        }
    }

    public void getTheEgg() {
        Froilanda.getEggs();

    }

}




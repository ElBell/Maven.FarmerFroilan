package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Horse;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;

import java.util.List;

public abstract class Day {
    private Farm farm = Farm.getInstance();
    private Farmer froilan = (Farmer) farm.getFarmHouse().getPerson("Froilan");
    private Pilot froilanda = (Pilot)farm.getFarmHouse().getPerson("Froilanda");
    private Fridge fridge = farm.getFridge();

    public abstract void run();

    public void haveBreakfast() {
        rideAndFeedAllHorses();
        froilandaEatBreakfast();
        froilanEatBreakfast();
    }

    private void rideAndFeedAllHorses() {
        for(Stable stable: farm.getStables()) {
            for(Horse horse: stable.getAll()) {
                froilan.mount(horse);
                froilan.dismount();
                horse.eat(fridge.getFood("corn", 3));
            }
        }
    }

    private void froilanEatBreakfast() {
        List<Edible> froilanBreakfast = fridge.getFood("corn", 1);
        froilanBreakfast.addAll(fridge.getFood("tomato", 2));
        froilanBreakfast.addAll(fridge.getFood("egg", 5));
        froilan.eat(froilanBreakfast);
    }

    private void froilandaEatBreakfast() {
        List<Edible> froilandaBreakfast = fridge.getFood("corn", 2);
        froilandaBreakfast.addAll(fridge.getFood("tomato", 1));
        froilandaBreakfast.addAll(fridge.getFood("egg", 2));
        froilanda.eat(froilandaBreakfast);
    }
}

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

public class FertilizeDay implements Day {
    private Farm farm = Farm.getInstance();
    private Farmer froilan = (Farmer) farm.getFarmHouse().getPerson("Froilan");
    private Pilot froilanda = (Pilot) farm.getFarmHouse().getPerson("Froilanda");
    private CropDuster cropDuster = (CropDuster) farm.getGarage().getCropDuster();
    private List<Stable> horseStables = farm.getStables();
    private Fridge fridge = farm.getFridge();

    public void rideEveryHorse() {
        for (Stable stables : horseStables) {
            for (Horse horse : stables.getAll()
            ) {
                froilan.mount(horse);
                froilan.dismount();
            }
        }
    }

    public void feedEveryHorse() {
        for (Stable stables : horseStables) {
            for (Horse horse : stables.getAll()
            ) {
                horse.eat(fridge.getFood("corn", 3));

            }
        }
    }

    public void feedingFroilan() {
        froilan.eat(fridge.getFood("corn", 1));
        froilan.eat(fridge.getFood("tomato", 2));
        froilan.eat(fridge.getFood("egg", 5));
    }

    public void feedingFroilanda() {
        froilanda.eat(fridge.getFood("corn", 2));
        froilan.eat(fridge.getFood("tomato", 1));
        froilan.eat(fridge.getFood("egg", 2));
    }

    public void froilandaFertilizingCrops() {
        //Had to make cropDuster implements Rideable
        froilanda.mount(cropDuster);
        cropDuster.fly();
        cropDuster.operate(farm);
        froilanda.dismount();
    }

    Morning morning = new Morning();

    @Override
    public void run() {
        rideEveryHorse();
        feedEveryHorse();
        feedingFroilan();
        feedingFroilanda();
        froilandaFertilizingCrops();
        froilan.getEggs();
        System.out.println(farm.getFridge());
    }
}

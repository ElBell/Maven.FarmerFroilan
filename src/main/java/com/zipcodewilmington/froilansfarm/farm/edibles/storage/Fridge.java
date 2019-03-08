package com.zipcodewilmington.froilansfarm.farm.edibles.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

import java.util.List;

public class Fridge {

    private StorageBin<Tomato> tomatoStorageBin = new StorageBin<>();
    private StorageBin<EdibleEgg> eggStorageBin = new StorageBin<>();
    private StorageBin<EarCorn> cornStorageBin = new StorageBin<>();
    private StorageBin<Wheat> wheatStorageBin = new StorageBin<>();

    public Fridge() {
        for (int i = 0; i < 70; i++) {
            tomatoStorageBin.store(new Tomato());
            eggStorageBin.store(new EdibleEgg());
            cornStorageBin.store(new EarCorn());
            wheatStorageBin.store(new Wheat());
        }
    }

    public void store(Edible edible) {
        if (edible instanceof Tomato) {
            tomatoStorageBin.store(edible);
        } else if (edible instanceof EdibleEgg) {
            eggStorageBin.store(edible);
        } else if (edible instanceof EarCorn) {
            cornStorageBin.store(edible);
        } else {
            wheatStorageBin.store(edible);
        }
    }

    public List<Edible> getFood(String foodName, int numberToGet) {
        switch (foodName.toLowerCase()) {
            case "tomato":
                return tomatoStorageBin.get(numberToGet);
            case "egg":
                return eggStorageBin.get(numberToGet);
            case "corn":
                return cornStorageBin.get(numberToGet);
            case "wheat":
                return wheatStorageBin.get(numberToGet);
            default:
                return null;
        }
    }
    public Integer amountOfEggs(){
       return eggStorageBin.getCount();


    }

    @Override
    public String toString() {
        return "Fridge{" +
                "tomatoes=" + tomatoStorageBin +
                ", eggs=" + eggStorageBin +
                ", corn=" + cornStorageBin +
                ", wheat=" + wheatStorageBin +
                '}';
    }
}

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

    @Override
    public String toString() {
        return "Fridge{" +
                "tomatoStorageBin=" + tomatoStorageBin +
                ", eggStorageBin=" + eggStorageBin +
                ", cornStorageBin=" + cornStorageBin +
                ", wheatStorageBin=" + wheatStorageBin +
                '}';
    }
}
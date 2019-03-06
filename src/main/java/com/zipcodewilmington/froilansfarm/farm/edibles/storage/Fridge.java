package com.zipcodewilmington.froilansfarm.farm.edibles.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

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

    public Edible getFood(String foodName) {
        switch (foodName.toLowerCase()) {
            case "tomato":
                return tomatoStorageBin.get();
            case "egg":
                return eggStorageBin.get();
            case "corn":
                return cornStorageBin.get();
            case "wheat":
                return wheatStorageBin.get();
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

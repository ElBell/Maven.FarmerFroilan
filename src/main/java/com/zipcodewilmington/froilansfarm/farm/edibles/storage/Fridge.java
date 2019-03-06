package com.zipcodewilmington.froilansfarm.farm.edibles.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;

public class Fridge {

    private TomatoStorageBin tomatoStorageBin = new TomatoStorageBin();
    private EggStorageBin eggStorageBin = new EggStorageBin();
    private CornStorageBin cornStorageBin = new CornStorageBin();
    private WheatStorageBin wheatStorageBin = new WheatStorageBin();

    public Fridge() {

    }

    public void store(Edible edible) {
        if (edible instanceof Tomato) {
            tomatoStorageBin.store((Tomato) edible);
        } else if (edible instanceof EdibleEgg) {
            eggStorageBin.store((EdibleEgg) edible);
        } else if (edible instanceof EarCorn) {
            cornStorageBin.store((EarCorn)edible);
        } else {
            wheatStorageBin.store((Wheat)edible);
        }
    }
}

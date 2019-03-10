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
    private final int NEEDED_FOOD = 150;

    public Fridge() {
        for (int i = 0; i < NEEDED_FOOD; i++) {
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
        try {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
            return null;
        }
    }
    public Integer amountOfEggs(){
       return eggStorageBin.getCount();


    }
    public int totalFood() {
        return tomatoStorageBin.getCount() + eggStorageBin.getCount() + cornStorageBin.getCount() + wheatStorageBin.getCount();
    }

    public int totalSellableEdibles() {
        int surplusEggs = eggStorageBin.getCount() - NEEDED_FOOD;
        int surplusTomatoes = tomatoStorageBin.getCount() - NEEDED_FOOD;
        int surplusWheat = wheatStorageBin.getCount() - NEEDED_FOOD;
        removeSurplust(surplusEggs, surplusTomatoes, surplusWheat);
        return surplusEggs + surplusTomatoes + surplusWheat;
    }

    private void removeSurplust(int supurplusEggs, int surplusTomatoes, int surplusWheat) {
        eggStorageBin.get(supurplusEggs);
        tomatoStorageBin.get(surplusTomatoes);
        wheatStorageBin.get(surplusWheat);
    }

    public int totalCornToBePurchased() {
        int neededCorn = NEEDED_FOOD - cornStorageBin.getCount();
        for (int i = 0; i < neededCorn; i++) {
            cornStorageBin.store(new EarCorn());
        }
        return neededCorn;
    }

    @Override
    public String toString() {
        return "    Fridge{" +
                "tomatoes=" + tomatoStorageBin +
                ", eggs=" + eggStorageBin +
                ", corn=" + cornStorageBin +
                ", wheat=" + wheatStorageBin +
                '}';
    }
}

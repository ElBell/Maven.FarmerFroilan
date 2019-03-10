package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Eater;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.rideables.Animal;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;

public class Horse extends Animal implements Rideable {
    public String makeNoise() {
        return "Neeeeeigh";
    }


}

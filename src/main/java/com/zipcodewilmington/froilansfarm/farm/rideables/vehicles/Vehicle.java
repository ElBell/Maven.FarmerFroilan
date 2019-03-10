package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.rideables.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    public String makeNoise() {
        return "Vrumm";
    }

    private static Vehicle anonymous = new Vehicle() {
    };

    public static Vehicle getAnonymous() {return  anonymous;}
}

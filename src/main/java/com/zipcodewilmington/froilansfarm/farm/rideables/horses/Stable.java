package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    private List<Horse> horses = new ArrayList<Horse>();

    public Stable(int numberOfHorses){
        for (int i = 0; i < numberOfHorses; i++) {
            addHorse(new Horse());
        }
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }
}

package com.zipcodewilmington.froilansfarm.farm.rideables;


import com.zipcodewilmington.froilansfarm.farm.people.Person;

public class Pilot extends Person implements Rider {

    private Rideable rideable = null;

    public Rideable getRideable() { return rideable; }

    public void mount(Rideable rideable) {
        this.rideable = rideable;
    }

    public void dismount() {
        this.rideable = null;
    }
}

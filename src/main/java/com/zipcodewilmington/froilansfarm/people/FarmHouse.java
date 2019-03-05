package com.zipcodewilmington.froilansfarm.people;

import java.util.HashMap;
import java.util.List;

public class FarmHouse {
    private HashMap<String, Person> people;

    public FarmHouse() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name, Person person) {
        this.people.put(name, person);
    }
}

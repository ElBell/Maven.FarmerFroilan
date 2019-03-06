package com.zipcodewilmington.froilansfarm.farm.people;

import java.util.HashMap;

public class FarmHouse {
    private HashMap<String, Person> people;

    public FarmHouse() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name, Person person) {
        this.people.put(name, person);
    }

    public Person getPerson(String name) {
        return people.get(name);
    }
}

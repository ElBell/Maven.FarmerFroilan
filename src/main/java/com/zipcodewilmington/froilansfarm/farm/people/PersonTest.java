package com.zipcodewilmington.froilansfarm.farm.people;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = Person.getAnonymous();
    }


    @Test
    public void eat() {
        Edible edible = new EarCorn();
        List<Edible> ediblesList = new ArrayList<>();
        ediblesList.add(edible);
        // When
        person.eat(ediblesList);

        // Then
        Assert.assertEquals(ediblesList,person.getEaten());

    }


    @Test
    public void makeNoise() {


        //when
        person.makeNoise();



        //Then
        Assert.assertEquals("Hi",person.makeNoise());
    }

    @Test
    public void getEggs() {
        Farm farm = Farm.getInstance();
        int expected = 15;

        // When
        int beforeGetEggs = farm.getFridge().amountOfEggs();
        person.getEggs();
        int afterGetEggs = farm.getFridge().amountOfEggs();
        int actual = afterGetEggs - beforeGetEggs;

        // Then
        Assert.assertEquals(expected, actual);

    }
}


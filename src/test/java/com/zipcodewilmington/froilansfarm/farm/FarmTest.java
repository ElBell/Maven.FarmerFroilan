package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.people.Person;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import org.junit.Assert;
import org.junit.Test;


public class FarmTest {

    @Test
    public void testFarmStables() {
        Farm farm = Farm.getInstance();
        int expected = 3;
        int actual = farm.getStables().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmHorses() {
        Farm farm = Farm.getInstance();
        int expected = 10;
        int actual = 0;
        for (Stable stable: farm.getStables()) {
            actual += stable.getCount();
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmChickenCoop() {
        Farm farm = Farm.getInstance();
        int expected = 4;
        int actual = farm.getChickenCoops().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmChickens() {
        Farm farm = Farm.getInstance();
        int expected = 15;
        int actual = 0;
        for (ChickenCoop chickenCoop: farm.getChickenCoops()) {
            actual += chickenCoop.getCount();
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmField() {
        Farm farm = Farm.getInstance();
        int expected = 5;
        int actual = farm.getField().getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmCropRows() {
        Farm farm = Farm.getInstance();
        int expected = 25;
        int actual = 0;
        for (CropRow cropRow: farm.getField().getAll()) {
            actual += cropRow.getCount();
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarmFarmHouse() {
        Farm farm = Farm.getInstance();
        Person actual = farm.getFarmHouse().getPerson("Froilan");
        Assert.assertTrue(actual instanceof Farmer);
    }

    @Test
    public void testFarmFarmHouse2() {
        Farm farm = Farm.getInstance();
        Person actual = farm.getFarmHouse().getPerson("Froilanda");
        Assert.assertFalse(actual instanceof Farmer);
    }

    @Test
    public void testFarmFarmHouse3() {
        Farm farm = Farm.getInstance();
        Person actual = farm.getFarmHouse().getPerson("Froilanda");
        Assert.assertTrue(actual instanceof Pilot);
    }

}
package com.zipcodewilmington.froilansfarm.farm.edibles.chickens;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {
    private ChickenCoop chickenCoop;
    @Before
    public void setUp() {
        chickenCoop = new ChickenCoop(0);
    }

    @After
    public void tearDown() {
        chickenCoop.removeAll();
    }

    @Test
    public void store() {
        Chicken expected = new Chicken();
        chickenCoop.store(expected);
        Chicken actual = chickenCoop.get();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        List<Chicken> expected = new ArrayList<>();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        expected.add(chicken3);
        expected.add(chicken2);
        expected.add(chicken1);
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        List<Chicken> actual = chickenCoop.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get1() {
        List<Chicken> expected = new ArrayList<>();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        expected.add(chicken3);
        expected.add(chicken2);
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        List<Chicken> actual = chickenCoop.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAll() {
        List<Chicken> expected = new ArrayList<>();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        expected.add(chicken1);
        expected.add(chicken2);
        expected.add(chicken3);
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        List<Chicken> actual = chickenCoop.getAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int expected = 3;
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        int actual = chickenCoop.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        int expected = 0;
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        chickenCoop.removeAll();
        int actual = chickenCoop.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = " {3}";
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        chickenCoop.store(chicken1);
        chickenCoop.store(chicken2);
        chickenCoop.store(chicken3);
        String actual = chickenCoop.toString();
        Assert.assertEquals(expected, actual);
    }
}
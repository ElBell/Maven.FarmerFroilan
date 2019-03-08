package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StableTest {
    private Stable stable;
    @Before
    public void setUp() {
        stable = new Stable(0);
    }

    @After
    public void tearDown() {
        stable.removeAll();
    }

    @Test
    public void store() {
        Horse expected = new Horse();
        stable.store(expected);
        Horse actual = stable.get();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        List<Horse> expected = new ArrayList<>();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        expected.add(horse3);
        expected.add(horse2);
        expected.add(horse1);
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        List<Horse> actual = stable.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get1() {
        List<Horse> expected = new ArrayList<>();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        expected.add(horse3);
        expected.add(horse2);
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        List<Horse> actual = stable.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAll() {
        List<Horse> expected = new ArrayList<>();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        expected.add(horse1);
        expected.add(horse2);
        expected.add(horse3);
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        List<Horse> actual = stable.getAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int expected = 3;
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        int actual = stable.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        int expected = 0;
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        stable.removeAll();
        int actual = stable.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = " {3}";
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        stable.store(horse1);
        stable.store(horse2);
        stable.store(horse3);
        String actual = stable.toString();
        Assert.assertEquals(expected, actual);
    }

}
package com.zipcodewilmington.froilansfarm.farm.edibles.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StorageBinTest {
    StorageBin storageBin;
    @Before
    public void setUp() {
        storageBin = new StorageBin();
    }

    @After
    public void tearDown() {
        storageBin.removeAll();
    }

    @Test
    public void store() {
        Edible expected = new Tomato();
        storageBin.store(expected);
        Edible actual = (Edible)storageBin.get();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        List<Edible> expected = new ArrayList<>();
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        expected.add(chicken3);
        expected.add(chicken2);
        expected.add(chicken1);
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        List<Edible> actual = storageBin.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get1() {
        List<Edible> expected = new ArrayList<>();
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        expected.add(chicken3);
        expected.add(chicken2);
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        List<Edible> actual = storageBin.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAll() {
        List<Edible> expected = new ArrayList<>();
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        expected.add(chicken1);
        expected.add(chicken2);
        expected.add(chicken3);
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        List<Edible> actual = storageBin.getAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int expected = 3;
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        int actual = storageBin.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        int expected = 0;
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        storageBin.removeAll();
        int actual = storageBin.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = " {3}";
        Edible chicken1 = new Tomato();
        Edible chicken2 = new Tomato();
        Edible chicken3 = new Tomato();
        storageBin.store(chicken1);
        storageBin.store(chicken2);
        storageBin.store(chicken3);
        String actual = storageBin.toString();
        Assert.assertEquals(expected, actual);
    }

}
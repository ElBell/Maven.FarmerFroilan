package com.zipcodewilmington.froilansfarm.farm.utilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StorageTest {
    private Storage storage;
    @Before
    public void setUp() {
        storage = Storage.getAnonymous();
    }

    @Test
    public void store() {
        Object expected = new Object();
        storage.store(expected);
        Object actual = storage.get();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        List<Object> expected = new ArrayList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        expected.add(object3);
        expected.add(object2);
        expected.add(object1);
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        List<Object> actual = storage.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get1() {
        List<Object> expected = new ArrayList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        expected.add(object3);
        expected.add(object2);
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        List<Object> actual = storage.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAll() {
        List<Object> expected = new ArrayList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        expected.add(object1);
        expected.add(object2);
        expected.add(object3);
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        List<Object> actual = storage.getAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int expected = 3;
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        int actual = storage.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        int expected = 0;
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        storage.removeAll();
        int actual = storage.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        storage.removeAll();
        String expected = " {3}";
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        storage.store(object1);
        storage.store(object2);
        storage.store(object3);
        String actual = storage.toString();
        Assert.assertEquals(expected, actual);
    }

}
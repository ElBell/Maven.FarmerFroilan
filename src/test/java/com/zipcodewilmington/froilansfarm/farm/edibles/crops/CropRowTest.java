package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CropRowTest {
    private CropRow cropRow;
    @Before
    public void setUp() {
        cropRow = new CropRow(TomatoPlant::new);
    }

    @After
    public void tearDown() {
        cropRow.removeAll();
    }

    @Test
    public void store() {
        Crop expected = new TomatoPlant();
        cropRow.store(expected);
        Crop actual = cropRow.get();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        List<Crop> expected = new ArrayList<>();
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        expected.add(crop3);
        expected.add(crop2);
        expected.add(crop1);
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        List<Crop> actual = cropRow.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get1() {
        List<Crop> expected = new ArrayList<>();
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        expected.add(crop3);
        expected.add(crop2);
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        List<Crop> actual = cropRow.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAll() {
        cropRow.removeAll();
        List<Crop> expected = new ArrayList<>();
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        expected.add(crop1);
        expected.add(crop2);
        expected.add(crop3);
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        List<Crop> actual = cropRow.getAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int expected = 8;
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        int actual = cropRow.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        int expected = 0;
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        cropRow.removeAll();
        int actual = cropRow.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = " {8}";
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new TomatoPlant();
        Crop crop3 = new TomatoPlant();
        cropRow.store(crop1);
        cropRow.store(crop2);
        cropRow.store(crop3);
        String actual = cropRow.toString();
        Assert.assertEquals(expected, actual);
    }
}
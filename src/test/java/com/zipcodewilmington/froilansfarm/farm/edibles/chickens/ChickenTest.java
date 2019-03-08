package com.zipcodewilmington.froilansfarm.farm.edibles.chickens;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    private Chicken chicken;
    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
    }

    @Test
    public void setHasBeenFertilized() {
        Assert.assertFalse(chicken.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilizedTrue() {
        chicken.setHasBeenFertilized(true);
        Assert.assertTrue(chicken.isHasBeenFertilized());
    }

    @Test
    public void makeNoise() {
        String expected = "ChaChiChaChiChaChi";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yield() {
        chicken.setHasBeenFertilized(false);
        EdibleEgg actual = chicken.yield();
        Assert.assertNotNull(actual);
    }

    @Test
    public void yield2() {
        chicken.setHasBeenFertilized(true);
        EdibleEgg actual = chicken.yield();
        Assert.assertNull(actual);
    }
}
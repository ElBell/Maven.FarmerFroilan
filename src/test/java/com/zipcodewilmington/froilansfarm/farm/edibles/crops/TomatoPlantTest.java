package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    private TomatoPlant tomatoPlant;
    @Before
    public void setUp() throws Exception {
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void setHasBeenFertilized() {
        Assert.assertFalse(tomatoPlant.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilizedTrue() {
        tomatoPlant.setHasBeenFertilized(true);
        Assert.assertTrue(tomatoPlant.isHasBeenFertilized());
    }

    @Test
    public void yield() {
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(false);
        Tomato actual = tomatoPlant.yield();
        Assert.assertNotNull(actual);
    }

    @Test
    public void yield2() {
        tomatoPlant.setHasBeenHarvested(false);
        tomatoPlant.setHasBeenFertilized(false);
        Tomato actual = tomatoPlant.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void yield3() {
        tomatoPlant.setHasBeenHarvested(true);
        tomatoPlant.setHasBeenFertilized(true);
        Tomato actual = tomatoPlant.yield();
        Assert.assertNull(actual);
    }
}
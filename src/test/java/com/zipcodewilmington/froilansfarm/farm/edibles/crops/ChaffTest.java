package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChaffTest {

    private Chaff chaff;
    @Before
    public void setUp() throws Exception {
        chaff = new Chaff();
    }

    @Test
    public void setHasBeenFertilized() {
        Assert.assertFalse(chaff.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilizedTrue() {
        chaff.setHasBeenFertilized(true);
        Assert.assertTrue(chaff.isHasBeenFertilized());
    }

    @Test
    public void yield() {
        chaff.setHasBeenFertilized(true);
        chaff.setHasBeenHarvested(false);
        Wheat actual = chaff.yield();
        Assert.assertNotNull(actual);
    }

    @Test
    public void yield2() {
        chaff.setHasBeenHarvested(false);
        chaff.setHasBeenFertilized(false);
        Wheat actual = chaff.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void yield3() {
        chaff.setHasBeenHarvested(true);
        chaff.setHasBeenFertilized(true);
        Wheat actual = chaff.yield();
        Assert.assertNull(actual);
    }
}
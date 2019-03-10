package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {
    Garage garage = new Garage();

    @Test
    public void getTractor() {
        Assert.assertNotNull(garage.getTractor());
    }

    @Test
    public void getTractor2() {
        Assert.assertTrue(garage.getTractor() instanceof Tractor);
    }

    @Test
    public void getCropDuster() {
        Assert.assertTrue(garage.getCropDuster() !=null);
    }

    @Test
    public void getCropDuster2() {
        Assert.assertTrue(garage.getCropDuster() instanceof CropDuster);
    }
}
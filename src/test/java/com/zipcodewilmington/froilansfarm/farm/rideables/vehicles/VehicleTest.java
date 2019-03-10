package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.farm.rideables.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle vehicle;

    @Before
    public void TestSetup() {
        vehicle = Vehicle.getAnonymous();
    }

    @Test
    public void makeNoise() {
        //Given
        String expected = "Vrumm";
        //When
        String actual = vehicle.makeNoise();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isInheritenceOfRideable() {
        //Given
        Boolean expected = true;
        //When
        Boolean actual = (vehicle instanceof Rideable);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isInheritenceOfNoiseMaker() {
        //Given
        Boolean expected = true;
        //When
        Boolean actual = (vehicle instanceof NoiseMaker);
        //Then
        Assert.assertEquals(expected,actual);
    }
}
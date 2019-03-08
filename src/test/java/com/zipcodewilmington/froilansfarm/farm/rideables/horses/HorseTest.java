package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.farm.rideables.Animal;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
public Horse horse = new Horse();

    @Test
    public void makeNoise() {
        //Given
        String expected = "Neeeeeigh";

        //When
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfAnimal() {
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (horse instanceof Animal);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfRideable() {
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (horse instanceof Rideable);

        //Then
        Assert.assertEquals(expected,actual);
    }
}
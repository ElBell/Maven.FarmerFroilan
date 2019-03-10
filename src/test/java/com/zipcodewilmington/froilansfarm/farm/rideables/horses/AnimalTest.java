package com.zipcodewilmington.froilansfarm.farm.rideables.horses;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void eat() {
        Horse horse = new Horse();
        List<Edible> expected = new ArrayList<>();
        EarCorn earCorn = new EarCorn();
        EarCorn earCorn1 = new EarCorn();
        expected.add(earCorn);
        expected.add(earCorn1);
        horse.eat(expected);
        List<Edible> actual = horse.getEaten();
        Assert.assertEquals(expected, actual);
    }
}
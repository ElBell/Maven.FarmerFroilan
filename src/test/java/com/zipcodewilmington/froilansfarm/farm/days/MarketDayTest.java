package com.zipcodewilmington.froilansfarm.farm.days;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarketDayTest {

    private MarketDay marketDay;
    private Farm farm = Farm.getInstance();
    @Before
    public void setUp() {
        marketDay = new MarketDay();
        farm.setFarm();
    }

    @After
    public void tearDown() {
        farm.setFarm();
    }

    @Test
    public void run() {
        int foodBefore = farm.getFridge().totalFood();
        System.out.println(foodBefore);
        marketDay.run();
        int foodAfter = farm.getFridge().totalFood();
        System.out.println(foodAfter);
        int actual = foodAfter - foodBefore;
        System.out.println(actual);
        int expected = -10;
        Assert.assertEquals(expected, actual);
    }



}
package com.zipcodewilmington.froilansfarm.farm.days;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
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
        farm.setFarm();
        for (int i = 0; i < 100; i++) {
            farm.getFridge().store(new EdibleEgg());
            farm.getFridge().store(new Tomato());
            farm.getFridge().store(new Wheat());
        }
        marketDay = new MarketDay();
    }

    @Test
    public void run() {
        int foodBefore = farm.getFridge().totalFood();
        marketDay.run();
        int foodAfter = farm.getFridge().totalFood();
        int expected = 300;
        int actual = foodBefore - foodAfter;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void run2() {
        int before = farm.getSavings();
        marketDay.run();
        int after = farm.getSavings();
        int expected = 257;
        int actual = after - before;
        Assert.assertEquals(expected, actual);
    }


}
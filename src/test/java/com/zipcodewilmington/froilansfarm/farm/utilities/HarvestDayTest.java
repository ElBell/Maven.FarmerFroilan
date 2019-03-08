package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarvestDayTest {

    private HarvestDay harvestDay;
    private Farm farm;
    @Before
    public void setUp() {
        harvestDay = new HarvestDay();
        farm = Farm.getInstance();
    }

    @Test
    public void run() {
        farm.setFridge(new Fridge());
        farm.populateField();
        int foodBefore = farm.getFridge().totalFood();
        for (CropRow cropRow: farm.getField().getAll()) {
            for(Crop crop: cropRow.getAll()) {
                crop.setHasBeenFertilized(true);
                crop.setHasBeenHarvested(false);
            }
        }
        harvestDay.run();
        int foodAfter = farm.getFridge().totalFood();
        int actual = foodAfter - foodBefore;
        int expected = 190;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void run2() {
        farm.setFridge(new Fridge());
        int foodBefore = farm.getFridge().totalFood();
        harvestDay.haveBreakfast();
        int foodAfter = farm.getFridge().totalFood();
        int actual = foodAfter - foodBefore;
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
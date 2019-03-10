package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.PlantEdible;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.time.temporal.TemporalAmount;

import static org.junit.Assert.*;

public class FarmerTest {

    @org.junit.Test
    public void getRideable() {
        // Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        // When
        farmer.mount(horse);
        Rideable rideable = farmer.getRideable();

        // Then
        Assert.assertNotNull(rideable);

    }

    @org.junit.Test
    public void getRideableNull() {
        // Given
        Farmer farmer = new Farmer();

        // When
        Rideable rideable = farmer.getRideable();

        // Then
        Assert.assertNull(rideable);

    }


    @org.junit.Test
    public void mount() {
        //Given
        Farmer farmer = new Farmer();

        // When
        Rideable rideable = new Horse();
        farmer.mount(rideable);
        Rideable actual = farmer.getRideable();


        // Then
        Assert.assertEquals(rideable, actual);
    }

    @org.junit.Test
    public void plant() {
        // Given
        Farmer farmer = new Farmer();

        // When
        CropRow getCropRow = new CropRow(TomatoPlant::new);
        farmer.plant(getCropRow);

        // Then
        Boolean actual = getCropRow.get().isHasBeenHarvested();
        Assert.assertFalse(actual);

    }


}

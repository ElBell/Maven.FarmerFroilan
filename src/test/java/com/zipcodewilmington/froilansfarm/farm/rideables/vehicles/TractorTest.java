package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.sun.org.apache.bcel.internal.generic.FADD;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Chaff;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {
private Farm farm = Farm.getInstance();

    @Test
    public void harvestTest() {
        //Given
        Farmer farmer = new Farmer();
        CropDuster cropDuster = new CropDuster();
        farmer.plant(farm.getField().getAll().get(1));
        cropDuster.operate(farm);
        Tractor tractor = new Tractor();
        Boolean expected = true;

        //When
        Crop crop = farm.getField().get().get();
        tractor.harvest(crop);
        Boolean actual = crop.isHasBeenHarvested();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void operateTest() {
        //Given
        Farmer farmer = new Farmer();
        CropDuster cropDuster = new CropDuster();
        Tractor tractor = new Tractor();
        farmer.plant(farm.getField().getAll().get(1));
        cropDuster.operate(farm);
        String expected = "    Fridge{" +
                "tomatoes=" + " {179}" +
                ", eggs=" + " {150}" +
                ", corn=" + " {150}" +
                ", wheat=" + " {150}" +
                '}';

        //When
        tractor.operate(farm);
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfFarmVehicleTest() {
        //Given
        Tractor tractor = new Tractor();
        Boolean expected = true;

        //When
        Boolean actual = tractor instanceof FarmVehicle;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfVehicleTest() {
        //Given
        Tractor tractor = new Tractor();
        Boolean expected = true;

        //When
        Boolean actual = tractor instanceof Vehicle;

        //Then
        Assert.assertEquals(expected,actual);
    }
}
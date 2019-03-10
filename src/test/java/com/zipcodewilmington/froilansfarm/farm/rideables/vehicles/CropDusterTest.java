package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CropDusterTest {

    Farm farm = Farm.getInstance();
    CropDuster cropDuster = (CropDuster) farm.getGarage().getCropDuster();


    @Test
    public void operateTest() {
        //Given
        Boolean expected = true;

        cropDuster.operate(farm);
        Boolean actual = farm.getField().get().get().isHasBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void fertilizeTest() {
        //Given
        Boolean expected = true;

        //When
        cropDuster.fertilize(farm.getField().getAll().get(1));
        Boolean actual = farm.getField().getAll().get(1).get().isHasBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flyTest() {
        //Given
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expected = "Froilanda: Ready for take off!";

        //When
        cropDuster.fly();
        String actual = new String(output.toByteArray());

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void flyTest2() {
        //Given
        Aircraft aircraft = new CropDuster();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expected = "Froilanda: Ready for take off!";

        //When
        aircraft.fly();
        String actual = new String(output.toByteArray());

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void instanceOfAircraft() {
        //Given
        Boolean expected = true;

        //When
        Boolean actual = cropDuster instanceof Aircraft;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfFarmVehicle() {
        //Given
        Boolean expected = true;

        //When
        Boolean actual = cropDuster instanceof FarmVehicle;

        //Then
        Assert.assertEquals(expected, actual);
    }
}
package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.edibles.storage.Fridge;
import com.zipcodewilmington.froilansfarm.farm.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.rideables.Pilot;
import com.zipcodewilmington.froilansfarm.farm.rideables.horses.Stable;
import com.zipcodewilmington.froilansfarm.farm.rideables.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FertilizeDayTest {
        Farm farm = Farm.getInstance();
        Farmer froilan = (Farmer) farm.getFarmHouse().getPerson("Froilan");
        Pilot froilanda = (Pilot) farm.getFarmHouse().getPerson("Froilanda");
        CropDuster cropDuster = (CropDuster) farm.getGarage().getCropDuster();
        List<Stable> horseStables = farm.getStables();
        Fridge fridge = farm.getFridge();

    @Test
    public void rideEveryHorse() {
        //Given

        //When

        //Then
    }

    @Test
    public void feedEveryHorse() {
        //Given
        String expected = "Fridge{" +
                "tomatoes=" + "{70}" +
                ", eggs=" + "{70}" +
                ", corn=" + "{40}" +
                ", wheat=" + "{70}" +
                '}';
        //When
        feedEveryHorse();
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void feedingFroilan() {
    }

    @Test
    public void feedingFroilanda() {
    }

    @Test
    public void froilandaFertilizingCrops() {
    }
}
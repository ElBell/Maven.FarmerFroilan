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
    public void feedEveryHorseTest() {
        //Given
        farm.setFridge(new Fridge());
        FertilizeDay fertilizeDay = new FertilizeDay();
        String expected = "Fridge{" +
                "tomatoes=" + " {70}" +
                ", eggs=" + " {70}" +
                ", corn=" + " {40}" +
                ", wheat=" + " {70}" +
                '}';
        //When
        fertilizeDay.feedEveryHorse();
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedingFroilanTest() {
        //Given
        farm.setFridge(new Fridge());
        FertilizeDay fertilizeDay = new FertilizeDay();
        String expected = "Fridge{" +
                "tomatoes=" + " {68}" +
                ", eggs=" + " {65}" +
                ", corn=" + " {69}" +
                ", wheat=" + " {70}" +
                '}';
        //When
        fertilizeDay.feedingFroilan();
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedingFroilandaTest() {
        //Given
        farm.setFridge(new Fridge());
        FertilizeDay fertilizeDay = new FertilizeDay();
        String expected = "Fridge{" +
                "tomatoes=" + " {69}" +
                ", eggs=" + " {68}" +
                ", corn=" + " {68}" +
                ", wheat=" + " {70}" +
                '}';
        //When
        fertilizeDay.feedingFroilanda();
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilandaFertilizingCropsTest() {
        //Given
        FertilizeDay fertilizeDay = new FertilizeDay();
        Boolean expected = true;

        //When
        fertilizeDay.froilandaFertilizingCrops();
        Boolean actual = farm.getField().get().get().isHasBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void runTest() {
        //Given
        farm.setFridge(new Fridge());
        FertilizeDay fertilizeDay = new FertilizeDay();
        String expected = "Fridge{" +
                "tomatoes=" + " {67}" +
                ", eggs=" + " {78}" +
                ", corn=" + " {37}" +
                ", wheat=" + " {70}" +
                '}';

        //When
        fertilizeDay.run();
        String actual = farm.getFridge().toString();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
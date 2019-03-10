package com.zipcodewilmington.froilansfarm.farm.edibles.storage;

import com.zipcodewilmington.froilansfarm.farm.edibles.chickens.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Tomato;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Wheat;
import com.zipcodewilmington.froilansfarm.farm.edibles.edibleutilities.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FridgeTest {

    @Test
    public void store() {
        Tomato expected = new Tomato();
        Fridge fridge = new Fridge();
        fridge.store(expected);
        Tomato actual = (Tomato)fridge.getFood("tomato", 1).get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood() {
        List<Edible> expected = new ArrayList<>();
        Tomato edible1 = new Tomato();
        Tomato edible2 = new Tomato();
        expected.add(edible2);
        expected.add(edible1);
        Fridge fridge = new Fridge();
        fridge.store(edible1);
        fridge.store(edible2);
        List<Edible> actual = fridge.getFood("tomato", 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood2() {
        List<Edible> expected = new ArrayList<>();
        EarCorn edible1 = new EarCorn();
        EarCorn edible2 = new EarCorn();
        expected.add(edible2);
        expected.add(edible1);
        Fridge fridge = new Fridge();
        fridge.store(edible1);
        fridge.store(edible2);
        List<Edible> actual = fridge.getFood("corn", 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood3() {
        List<Edible> expected = new ArrayList<>();
        Wheat edible1 = new Wheat();
        Wheat edible2 = new Wheat();
        expected.add(edible2);
        expected.add(edible1);
        Fridge fridge = new Fridge();
        fridge.store(edible1);
        fridge.store(edible2);
        List<Edible> actual = fridge.getFood("wheat", 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood4() {
        List<Edible> expected = new ArrayList<>();
        EdibleEgg edible1 = new EdibleEgg();
        EdibleEgg edible2 = new EdibleEgg();
        expected.add(edible2);
        expected.add(edible1);
        Fridge fridge = new Fridge();
        fridge.store(edible1);
        fridge.store(edible2);
        List<Edible> actual = fridge.getFood("egg", 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodNull() {
        Fridge fridge = new Fridge();
        List<Edible> actual = fridge.getFood("egg", 2000);
        Assert.assertNull(actual);
    }

    @Test
    public void getFoodNull2() {
        Fridge fridge = new Fridge();
        List<Edible> actual = fridge.getFood("Something", 1);
        Assert.assertNull(actual);
    }

    @Test
    public void toStringTest() {
        String expected = "    Fridge{tomatoes= {150}, eggs= {150}, corn= {150}, wheat= {150}}";
        Fridge fridge = new Fridge();
        String actual = fridge.toString();
        Assert.assertEquals(expected, actual);
    }
}
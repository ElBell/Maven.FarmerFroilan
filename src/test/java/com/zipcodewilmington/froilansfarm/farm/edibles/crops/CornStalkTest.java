package com.zipcodewilmington.froilansfarm.farm.edibles.crops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {

    private CornStalk cornStalk;
    @Before
    public void setUp() throws Exception {
        cornStalk = new CornStalk();
    }

    @Test
    public void setHasBeenFertilized() {
        Assert.assertFalse(cornStalk.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilizedTrue() {
        cornStalk.setHasBeenFertilized(true);
        Assert.assertTrue(cornStalk.isHasBeenFertilized());
    }

    @Test
    public void yield() {
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(false);
        EarCorn actual = cornStalk.yield();
        Assert.assertNotNull(actual);
    }

    @Test
    public void yield2() {
        cornStalk.setHasBeenHarvested(false);
        cornStalk.setHasBeenFertilized(false);
        EarCorn actual = cornStalk.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void yield3() {
        cornStalk.setHasBeenHarvested(true);
        cornStalk.setHasBeenFertilized(true);
        EarCorn actual = cornStalk.yield();
        Assert.assertNull(actual);
    }
}
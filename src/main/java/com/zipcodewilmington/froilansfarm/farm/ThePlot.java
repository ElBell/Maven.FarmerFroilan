package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.utilities.HarvestDay;

public class ThePlot {
    private static HarvestDay harvestDay = new HarvestDay();

    public static void main(String[] args) {
        harvestDay.run();
    }

}

package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.utilities.HarvestDay;
import com.zipcodewilmington.froilansfarm.farm.utilities.Morning;
import com.zipcodewilmington.froilansfarm.farm.utilities.PlantDay;

public class ThePlot {
    private static HarvestDay harvestDay = new HarvestDay();
    private static PlantDay plantDay = new PlantDay();
    private static Morning morning = new Morning();

    public static void main(String[] args) {
        morning.run();
        plantDay.run();
        harvestDay.run();

    }

}

package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.farm.utilities.FertilizeDay;
import com.zipcodewilmington.froilansfarm.farm.utilities.HarvestDay;


public class ThePlot {
    private static FertilizeDay fertilizeDay = new FertilizeDay();
    private static HarvestDay harvestDay = new HarvestDay();

    public static void main(String[] args) {
        fertilizeDay.run();
        harvestDay.run();
    }

}

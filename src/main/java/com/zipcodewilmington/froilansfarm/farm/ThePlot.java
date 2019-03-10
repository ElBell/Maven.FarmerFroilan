package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.farm.days.FertilizeDay;
import com.zipcodewilmington.froilansfarm.farm.days.HarvestDay;
import com.zipcodewilmington.froilansfarm.farm.days.MarketDay;
import com.zipcodewilmington.froilansfarm.farm.days.PlantDay;


public class ThePlot {
    private static FertilizeDay fertilizeDay = new FertilizeDay();
    private static HarvestDay harvestDay = new HarvestDay();
    private static PlantDay plantDay = new PlantDay();
    private static MarketDay marketDay = new MarketDay();

    public static void main(String[] args) {
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
        runWeek();
    }

    private static void runWeek() {
        plantDay.run();
        fertilizeDay.run();
        harvestDay.run();
        plantDay.run();
        fertilizeDay.run();
        harvestDay.run();
        marketDay.run();
    }

}

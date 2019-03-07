package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.utilities.FertilizeDay;

public class ThePlot {
    private static final Farm farm = Farm.getINSTANCE();

    public static void main(String[] args) {
        FertilizeDay fertilizeDay = new FertilizeDay();
        fertilizeDay.run();
    }


}

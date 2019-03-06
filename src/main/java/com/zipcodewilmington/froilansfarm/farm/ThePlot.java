package com.zipcodewilmington.froilansfarm.farm;

public class ThePlot {
    private static final Farm farm = new Farm();

    public static void main(String[] args) {
        farm.populateField();
        farm.populateChickenCoops();
        farm.populateStables();
        farm.populateFarmHouse();
    }


}

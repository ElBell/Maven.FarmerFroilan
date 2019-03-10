package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

public class CornStalk extends Crop {
    public EarCorn yield() {
         if (isHasBeenFertilized() && !isHasBeenHarvested()) {
             return new EarCorn();
         }
         return null;
    }
}

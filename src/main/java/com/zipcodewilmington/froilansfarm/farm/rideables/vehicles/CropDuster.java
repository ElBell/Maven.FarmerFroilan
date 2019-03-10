package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.rideables.Rideable;

public class CropDuster extends Aircraft implements FarmVehicle {
    public void operate(Farm farm) {
        for (CropRow cropRow: farm.getField().getAll()) {
            fertilize(cropRow);
        }
    }

    public void fertilize(CropRow cropRow){
        for (Crop crop: cropRow.getAll()) {
            crop.setHasBeenFertilized(true);
        }
    }

    @Override
    public void fly() {
        Runnable runnable = () -> {
            System.out.print("Froilanda: Ready for take off!");
        }; runnable.run();
    }
}

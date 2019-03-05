package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;

public class CropDuster extends Aircraft implements FarmVehicle {
    public void operate(Farm farm) {
        for (CropRow cropRow: farm.getField().getCropRows()) {
            fertilize(cropRow);
        }
    }

    public void fertilize(CropRow cropRow){
        cropRow.fertilizeAllCrops();
    }
}

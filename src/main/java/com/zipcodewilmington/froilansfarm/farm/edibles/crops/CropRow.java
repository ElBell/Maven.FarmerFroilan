package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CropRow {
    private List<Crop> crops = new ArrayList<Crop>();

    public CropRow(Supplier<Crop> supplier) {
        for (int i = 0; i < 5; i++) {
            addCrop(supplier.get());
        }

    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public void fertilizeAllCrops(){
        for (Crop crop: crops) {
            crop.setHasBeenFertilized(true);
        }
    }
}

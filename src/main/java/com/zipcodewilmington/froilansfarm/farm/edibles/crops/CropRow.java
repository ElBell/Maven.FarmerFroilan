package com.zipcodewilmington.froilansfarm.farm.edibles.crops;

import com.zipcodewilmington.froilansfarm.farm.utilities.Storage;

import java.util.function.Supplier;

public class CropRow extends Storage<Crop> {

    public CropRow(Supplier<Crop> supplier) {
        for (int i = 0; i < 35; i++) {
            store(supplier.get());
        }
    }
}

package com.zipcodewilmington.froilansfarm.farm.edibles;

import com.zipcodewilmington.froilansfarm.farm.edibles.crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {
    List<CropRow> cropRows = new ArrayList<CropRow>();

    public List<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    public void addCropRow(CropRow cropRow) {
        cropRows.add(cropRow);
    }
}

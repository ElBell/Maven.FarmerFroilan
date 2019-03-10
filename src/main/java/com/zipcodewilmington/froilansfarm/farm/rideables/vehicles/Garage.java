package com.zipcodewilmington.froilansfarm.farm.rideables.vehicles;

public class Garage {
    private FarmVehicle tractor;
    private FarmVehicle cropDuster;

    public Garage() {
        this.tractor = new Tractor();
        this.cropDuster = new CropDuster();
    }

    public FarmVehicle getTractor() {
        return tractor;
    }

    public FarmVehicle getCropDuster() {
        return cropDuster;
    }
}

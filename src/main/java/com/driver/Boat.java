package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capavity;

    public Boat() {
    }
    @Override
    public String getVehicleName() {
        return "Boat1";
    }

    @Override
    public int getVehicleCapacity() {
        return 50;
    }


}

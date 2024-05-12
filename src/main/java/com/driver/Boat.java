package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return "Boat1";
    }

    @Override
    public int getVehicleCapacity() {
        return 50;
    }
}

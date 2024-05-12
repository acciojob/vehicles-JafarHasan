package com.driver.test;

import com.driver.Car;
import com.driver.F1;
import com.driver.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {
    @Test
    public void testVehicle() {
        Vehicle vehicle = new Vehicle("Vehicle1");
        assertEquals("Vehicle1", vehicle.getName());
    }

    @Test
    public void testCar1() {
        Car car = new Car("Car1", 4, 4, 5, true, "SUV", 7);
        assertEquals(4, car.getWheels());
    }

    @Test
    public void testCar2() {
        Car car = new Car("Car2", 4, 4, 5, true, "SUV", 7);
        assertEquals(7, car.getSeats());
    }

    @Test
    public void testF11() {
        F1 f1 = new F1("F1_1", true);
        assertEquals(6, f1.getGears());
    }

    @Test
    public void testF12() {
        F1 f1 = new F1("F1_2", true);
        f1.accelerate(3);
        assertEquals(300, f1.getCurrentSpeed());
    }
}

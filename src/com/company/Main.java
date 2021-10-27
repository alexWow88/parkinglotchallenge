package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car newCar = new Car();
        Motorcycle newMotorcycle = new Motorcycle();
        Van newVan = new Van();
        ParkingLot newParkingLot = new ParkingLot();

        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            System.out.println("What type of vehicle wants to park? 1. Motorcycle    2. Car    3. Van");
            int newVehicleParking = myScanner.nextInt();
            if (newVehicleParking == 1) {
                newParkingLot.isCanVehiclePark(newMotorcycle);
            } else if (newVehicleParking == 2) {
                newParkingLot.isCanVehiclePark(newCar);
            } else if (newVehicleParking == 3) {
                newParkingLot.isCanVehiclePark(newVan);
            }
            newParkingLot.getRemainingSpaceCount();
            newParkingLot.isFull();
            newParkingLot.isEmpty();
            newParkingLot.isParkingTypeFull();
            System.out.println(" ");
        }
    }
}

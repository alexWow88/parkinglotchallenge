package com.company;

public class ParkingLot {
    private int totalParkingSpaces = 100;
    private int normalParkingSpaces = 70;
    private int compactParkingSpaces = 20;
    private int largeParkingSpaces = 10;
    private int vanTotalParkingSpacesTaken = 0;
    private int vanLargeParkingSpacesTaken = 0;
    private int vanNormalParkingSpacesTaken = 0;

    public int getTotalParkingSpaces() {
        return totalParkingSpaces;
    }

    public void setTotalParkingSpaces(int totalParkingSpaces) {
        this.totalParkingSpaces = totalParkingSpaces;
    }

    public int getNormalParkingSpaces() {
        return normalParkingSpaces;
    }

    public void setNormalParkingSpaces(int normalParkingSpaces) {
        this.normalParkingSpaces = normalParkingSpaces;
    }

    public int getCompactParkingSpaces() {
        return compactParkingSpaces;
    }

    public void setCompactParkingSpaces(int compactParkingSpaces) {
        this.compactParkingSpaces = compactParkingSpaces;
    }

    public int getLargeParkingSpaces() {
        return largeParkingSpaces;
    }

    public void setLargeParkingSpaces(int largeParkingSpaces) {
        this.largeParkingSpaces = largeParkingSpaces;
    }

    // Methods
    public void getRemainingSpaceCount () {
        System.out.println("Remaining Spaces: ");
        System.out.println("Compact Spaces: " + this.compactParkingSpaces);
        System.out.println("Normal Spaces: " + this.normalParkingSpaces);
        System.out.println("Van Spaces: " + this.largeParkingSpaces);
    }

    public void isFull () {
        if (normalParkingSpaces == 0 && compactParkingSpaces == 0 && largeParkingSpaces == 0) {
            System.out.println("Parking Lot is currently full");
        }
    }

    public void isEmpty () {
        if (normalParkingSpaces == 70 && compactParkingSpaces == 20 && largeParkingSpaces == 10) {
            System.out.println("Parking Lot is currently empty");
        }
    }

    public void isParkingTypeFull () {
        if (this.normalParkingSpaces == 0) {
            System.out.println("No Normal Parking spots are available");
        }
        if (this.compactParkingSpaces == 0) {
            System.out.println("No Compact Parking spots are available");
        }
        if (this.largeParkingSpaces == 0) {
            System.out.println("No large Parking spots are available");
        }
    }

    public int isCanVehiclePark (Car newCar) {
        if ((this.normalParkingSpaces - newCar.getNormalParkingSize()) >= 0) {
            System.out.println("Car parked in normal size space");
            return this.normalParkingSpaces = normalParkingSpaces - newCar.getNormalParkingSize();
        } else if ((this.compactParkingSpaces -newCar.getCompactParkingSize()) >= 0) {
            System.out.println("Car parked in compact size space");
            return this.compactParkingSpaces = compactParkingSpaces - newCar.getCompactParkingSize();
        } else {
            System.out.println("No parking available");
        }
        return 0;
    }

    public int isCanVehiclePark (Motorcycle newMotorcycle) {
        if ((this.compactParkingSpaces - newMotorcycle.getCompactParkingSize()) >= 0) {
            System.out.println("Motorcycle parked in compact size space");
            return this.compactParkingSpaces = compactParkingSpaces - newMotorcycle.getCompactParkingSize();
        } else if ((this.normalParkingSpaces - newMotorcycle.getNormalParkingSize()) >= 0) {
            System.out.println("Motorcycle parked in normal size space");
            return this.normalParkingSpaces = normalParkingSpaces - newMotorcycle.getNormalParkingSize();
        } else if ((this.largeParkingSpaces - newMotorcycle.getLargeParkingSize()) >= 0) {
            System.out.println("Motorcycle parked in large size space");
            return this.largeParkingSpaces = largeParkingSpaces - newMotorcycle.getLargeParkingSize();
        } else {
            System.out.println("No parking available");
        }
        return 0;
    }

    public int isCanVehiclePark (Van newVan) {
        if ((this.largeParkingSpaces - newVan.getLargeParkingSize()) >= 0) {
            System.out.println("Van parked in large size space");
            this.vanLargeParkingSpacesTaken += 1;
            this.vanTotalParkingSpacesTaken += 1;
            System.out.println("Vans taking up " + this.vanLargeParkingSpacesTaken + " large parking spaces, " + this.vanNormalParkingSpacesTaken + " normal parking spaces, " + this.vanTotalParkingSpacesTaken + " total spaces");
            return this.largeParkingSpaces = largeParkingSpaces - newVan.getLargeParkingSize();
        } else if ((this.normalParkingSpaces - newVan.getNormalParkingSize()) >= 0) {
            System.out.println("Van parked in 3 normal size spaces");
            this.vanNormalParkingSpacesTaken += 1;
            this.vanTotalParkingSpacesTaken += 1;
            System.out.println("Vans taking up " + this.vanLargeParkingSpacesTaken + " large parking spaces, " + this.vanNormalParkingSpacesTaken + " normal parking spaces, " + this.vanTotalParkingSpacesTaken + " total spaces");
            return this.normalParkingSpaces = normalParkingSpaces - newVan.getNormalParkingSize();
        } else {
            System.out.println("No parking available");
        }
        return 0;
    }
}

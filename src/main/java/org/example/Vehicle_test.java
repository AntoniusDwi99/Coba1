package org.example;

class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String vehicleSound() {
        return "vehicle sound";
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    public int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }
    @Override
    public String vehicleSound() {
        return "Broooom";
    }
    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numOfDoors);
    }
}
class Motorcycle extends Vehicle {
    public String hasSidecar;
    public Motorcycle(String brand, String model, int year, String hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String vehicleSound() {
        return "Ngeeeeeng";
    }
    public void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
public class Vehicle_test {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Fortuner", 2020, 4);
        System.out.println("Description of Car:");
        car.displayCarInfo();
        System.out.println("Car Sound: " + car.vehicleSound());

        Motorcycle motorcycle = new Motorcycle("N-max", "150cc", 2023, "Yes");
        System.out.println("\nDescription of Motorcycle :");
        motorcycle.displayMotorcycleInfo();
        System.out.println("Motorcycle Sound: " + motorcycle.vehicleSound());

        try{
            int [] arrcar  = new int [2018];
            int yearcar =  arrcar[2019];

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vehicle was not created because year of vehicle is "+e.getMessage());
        }
    }
}
class Vehicle{
    String registrationNumber;
    String brand;
    double rentalRate;

    //Constructor
    Vehicle(String registrationNumber, String brand, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }
    // Method to calculate rent
    double calculateRent(int days) {
        return rentalRate * days;
    }
    // display details
    void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
 class Car extends Vehicle {
    int numberOfSeats;

    // Constructor
    Car(String registrationNumber, String brand, double rentalRate, int numberOfSeats) {
        super(registrationNumber, brand, rentalRate);
        this.numberOfSeats = numberOfSeats;
    }

    //Method overriding
    @Override
    double calculateRent(int days) {
        double baseRent = super.calculateRent(days);
        return baseRent + (numberOfSeats * 10); // Additional charge based on number of seats

  
    }
}
class Bike extends Vehicle{
    int engineCapacity;
    Bike(String registrationNumber, String brand, double rentalRate, int engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }
    //Method overriding
    @Override
    double calculateRent(int days) {
        double baseRent = super.calculateRent(days);
        return baseRent + (engineCapacity * 5); // Additional charge based on engine capacity
    }
    @Override 
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 50.0, 5);
        Bike bike = new Bike("XYZ789", "Honda", 30.0, 150);

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Rent for 3 days: " + car.calculateRent(3));

        System.out.println("\nBike Details:");
        bike.displayDetails();
        System.out.println("Rent for 2 days: " + bike.calculateRent(2));
    }
}
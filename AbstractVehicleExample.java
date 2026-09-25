abstract class AbstractVehicle {

    String brand;

    // Constructor
    AbstractVehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void start();

    // Normal method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


// Car class
class Car extends AbstractVehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}


// Bike class
class Bike extends AbstractVehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bike is starting with a button.");
    }
}


// Main class
public class AbstractVehicleExample {

    public static void main(String[] args) {

        AbstractVehicle car = new Car("Toyota");

        car.displayBrand();
        car.start();

        System.out.println();

        AbstractVehicle bike = new Bike("Honda");

        bike.displayBrand();
        bike.start();
    }
}


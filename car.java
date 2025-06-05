class Car {
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarApp {
    public static void main(String[] args) {
        // Create a car object
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Display car info
        myCar.display();
    }
}
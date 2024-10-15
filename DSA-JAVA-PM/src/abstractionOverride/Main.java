package abstractionOverride;

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car(4, 5, 25000);

        // Create a Boat object
        Boat myBoat = new Boat(45.5, 8000);

        // Invoke the Vehicle methods for Car
        System.out.println("Car details:");
        myCar.showVehicleDetails();
        myCar.doVehicleSound();

        // Invoke the Vehicle methods for Boat
        System.out.println("\nBoat details:");
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();

        // Print the Boat weight and speed using the dedicated method
        System.out.println("\nBoat weight and speed:");
        System.out.println(myBoat.getBoatWeightAndSpeed());
    }
}


// Abstract class Vehicle
abstract class Vehicle {
    protected String type;
    protected int numberOfWheels;

    // Method to show vehicle details
    public void showVehicleDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    // Abstract method to be implemented by subclasses
    public abstract void doVehicleSound();
}

// Subclass Car of Vehicle
class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    // Constructor for Car
    public Car(int wheels, int doors, double price) {
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    // Overriding the showVehicleDetails method
    @Override
    public void showVehicleDetails() {
        // Call the superclass method
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Car Price: $" + carPrice);
    }

    // Implementing the abstract method for Car sound
    @Override
    public void doVehicleSound() {
        System.out.println("Car sound: Vroom Vroom!");
    }
}



// Subclass Boat of Vehicle
class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    // Constructor for Boat
    public Boat(double maxSpeed, int weight) {
        this.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    // Implementing the abstract method for Boat sound
    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Splash Splash!");
    }

    // Method to return the boat's weight and speed information
    public String getBoatWeightAndSpeed() {
        return "Boat Weight: " + boatKilosWeight + " kg, Max Speed: " + maxKnotsSpeed + " knots";
    }
}

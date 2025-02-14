import java.util.Scanner;

// Base class: Vehicle
class Vehicle {
    // Fields to store vehicle details
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Additional field specific to Car
    private String fuelType;

    // Constructor to initialize all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        // Calling the constructor of the superclass (Vehicle)
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Override the displayDetails method to also print fuel type
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the superclass method to print vehicle details
        System.out.println("Fuel Type: " + fuelType); // Print fuel type
    }
}

// Showroom class to interact with the user
public class Showroom {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the vehicle details
        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after reading an integer

        System.out.print("Enter the fuel type of the car: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object with user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Call the displayDetails method to display the car's details
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}

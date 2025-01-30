import java.util.Scanner;

interface Vehicle {
    void displayInfo();
}

class Car implements Vehicle {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter car brand: ");
        String brand = scanner.nextLine();
        
        System.out.println("Enter car model: ");
        String model = scanner.nextLine();
        
        System.out.println("Enter manufacturing year: ");
        int year = scanner.nextInt();
        
        System.out.println("Enter battery capacity: ");
        int batteryCapacity = scanner.nextInt();
        
        ElectricCar myCar = new ElectricCar(brand, model, year, batteryCapacity);
        System.out.println("<--------- Car Information --------->");
        myCar.displayInfo();
        
        scanner.close();
    }
}



public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, "Gasoline");
        ElectricCar electricCar = new ElectricCar("Tesla", 2023, 85);

        System.out.println("Car:");
        car.displayDetails();

        System.out.println("\nElectric Car:");
        electricCar.displayDetails();
    }
}


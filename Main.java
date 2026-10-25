public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Corolla", 2020, 4);
        vehicle.displayInfo();

        vehicle = new Motorcycle("Honda", "Civic", 2015, "150cc");
        vehicle.displayInfo();

        vehicle = new Truck("Ford", "F-100", 1965, 1000);
        vehicle.displayInfo();


        System.out.println("\n=== 2. Method Parameter ===");

        Car car = new Car("Honda", "Civic", 2015, 4);
        Motorcycle motorcycle =
                new Motorcycle("Kawasaki", "Ninja", 2017, "998cc");
        Truck truck = new Truck("Mitsubishi", "Strada", 2021, 1200);

        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);


        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Yamaha", "YZF-R1", 2015, "998cc"),
            new Truck("Ford", "F-100", 1965, 1000)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
        }
    }
}
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TollCalculator {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle Car = new Car(false);
        Vehicle CarWTrailer = new Car(true);
        Vehicle Tank = new Tank();
        Vehicle Truck4Wheels = new Truck(4);
        Vehicle Truck6Wheels = new Truck(6);
        Vehicle Truck8Wheels = new Truck(8);
        vehicleList.add(Car);
        vehicleList.add(CarWTrailer);
        vehicleList.add(Tank);
        vehicleList.add(Truck4Wheels);
        vehicleList.add(Truck6Wheels);
        vehicleList.add(Truck8Wheels);

        System.out.println("\n\n********* \tRoute 66 Toll Calculator \t*********");
        System.out.println("\nVehicle\t\t\tDistance Traveled\t\t\tToll $");
        System.out.println("--------------------------------------------------");

        List<Integer> totalMiles = new ArrayList<>();
        List<Double> totalToll = new ArrayList<>();
        for (Vehicle vehicleInventory : vehicleList) {
            int highRange = 241;
            int lowRange = 10;
            int randomDistance = new Random().nextInt(highRange)+lowRange;
            totalMiles.add(randomDistance);
            totalToll.add(vehicleInventory.calculateToll(randomDistance));
            System.out.printf("%-22s %-21d %s%.2f\n", vehicleInventory, randomDistance, "$", vehicleInventory.calculateToll(randomDistance));
        }
        int totalMilesNumber = 0;
        //totalMilesNumber += totalMiles.get(0) + totalMiles.get(1) + totalMiles.get(2) + totalMiles.get(3) + totalMiles.get(4) + totalMiles.get(5);
        // simplify above w/ for loop, also more generic, if I add Vehicles to the inventory, everything runs correctly w/ adjusted list size.
        for (int i = 0; i < totalMiles.size(); i++) {
            totalMilesNumber += totalMiles.get(i);
        }
        double totalTollNumber = 0;
        //totalTollNumber += totalToll.get(0) + totalToll.get(1) + totalToll.get(2) + totalToll.get(3) + totalToll.get(4) + totalToll.get(5);
        // simplify above w/ for loop, also more generic, if I add Vehicles to the inventory, everything runs correctly w/ adjusted list size.
        for (int i = 0; i < totalToll.size(); i++) {
            totalTollNumber += totalToll.get(i);
        }
        System.out.println("\nTotal Miles Traveled: " + totalMilesNumber);
        System.out.printf("Total Tollbooth Revenue: $%.2f", totalTollNumber);
    }
}


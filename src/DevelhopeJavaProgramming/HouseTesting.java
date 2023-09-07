package DevelhopeJavaProgramming;

import java.util.Scanner;

public class HouseTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a House object
        House myHouse = new House();

        // Set values using setters
        System.out.print("Enter the number of floors: ");
        int floors = scanner.nextInt();
        myHouse.setFloorsNumber(floors);

        System.out.print("Enter the address: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        myHouse.setAddress(address);

        System.out.print("Enter the residents' names (comma-separated): ");
        String namesInput = scanner.nextLine();
        String[] namesArray = namesInput.split(",");
        myHouse.setResidentsNames(namesArray);

        // Print house details using getters and String.format()
        System.out.println("\nHouse Details:");
        System.out.println(String.format("Floors: %d", myHouse.getFloorsNumber()));
        System.out.println(String.format("Address: %s", myHouse.getAddress()));
        System.out.println("Residents:");
        for (String name : myHouse.getResidentsNames()) {
            System.out.print(" " + name.trim()); // Trim to remove leading/trailing spaces
        }
        scanner.close();
    }
}

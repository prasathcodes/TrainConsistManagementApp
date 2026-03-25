import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC8 - Filter Passenger Bogies Using Streams ===\n");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("General", 90);

        System.out.println("All Bogies:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nFiltered Bogies (Capacity > 60):");

        bogieCapacity.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 60)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );

        System.out.println("\nUC8 filtering completed...");
    }
}
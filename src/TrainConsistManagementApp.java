import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC10 - Count Total Seats in Train ===\n");

        List<Map.Entry<String, Integer>> bogies = new ArrayList<>();

        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 72));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 56));
        bogies.add(new AbstractMap.SimpleEntry<>("First Class", 24));
        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 70));

        System.out.println("Bogies in Train:");
        for (Map.Entry<String, Integer> entry : bogies) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int totalCapacity = bogies.stream()
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}
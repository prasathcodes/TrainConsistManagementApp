import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC9 - Group Bogies by Type ===\n");

        List<Map.Entry<String, Integer>> bogies = new ArrayList<>();

        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 72));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 56));
        bogies.add(new AbstractMap.SimpleEntry<>("First Class", 24));
        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 70));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 60));

        System.out.println("All Bogies:");
        for (Map.Entry<String, Integer> entry : bogies) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nGrouped Bogies:\n");

        Map<String, List<Integer>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                        ));

        for (Map.Entry<String, List<Integer>> entry : grouped.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());
            for (Integer capacity : entry.getValue()) {
                System.out.println("  Capacity -> " + capacity);
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}
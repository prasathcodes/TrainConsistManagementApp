import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC7 - Sort Bogies by Capacity (Comparator) ===\n");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("General", 90);

        System.out.println("Before Sorting:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Convert to list for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogieCapacity.entrySet());

        // Sort using Comparator (ascending by capacity)
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });

        System.out.println("\nAfter Sorting by Capacity:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC7 sorting completed...");
    }
}
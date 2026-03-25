import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC6 - Map Bogie to Capacity (HashMap) ===\n");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}
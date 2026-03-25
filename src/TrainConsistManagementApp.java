import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        System.out.println("=== UC4 - Maintain Ordered Bogie Consist ===\n");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train + "\n");

        train.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(train + "\n");

        train.removeFirst();
        train.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(train + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}
import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UES - Map Bogie to Capacity (HashMap)");
        System.out.println();

        // Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with capacities
        bogieCapacity.put("First Class", 40);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("Cargo", 100);
        bogieCapacity.put("AC Chair", 50);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("UES bogie-capacity mapping completed...");
    }
}
import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UES - Preserve Insertion Order of Bogies");
        System.out.println();

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> bogies = new LinkedHashSet<>();

        // Adding bogies (including duplicates intentionally)
        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("Cargo");
        bogies.add("Guard");
        bogies.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("Final Train Formation:");
        for (String b : bogies) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UES formation setup completed...");
    }
}
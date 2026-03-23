import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create a HashSet for bogie IDs
        HashSet<String> bogies = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogies.add("B101");
        bogies.add("B202");
        bogies.add("B303");
        bogies.add("B202"); // duplicate
        bogies.add("B101"); // duplicate
        bogies.add("B404");

        // Display result
        System.out.println("UES - Track Unique Bogie IDs");
        System.out.println();

        System.out.println("Bogie IDs After Insertion:");
        for (String b : bogies) {
            System.out.print(b + " ");
        }

        System.out.println("\n");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("All uniqueness validated successfully.");
    }
}
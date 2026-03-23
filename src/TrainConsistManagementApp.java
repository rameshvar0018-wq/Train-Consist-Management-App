import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create a LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        System.out.println("UES - Maintain Ordered Bogie Consist");
        System.out.println();

        // Initial insertion
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter Inserting Pantry Car:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();   // removes Engine
        train.removeLast();    // removes Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        System.out.println("\nAll ordered consist activities completed...");
    }
}
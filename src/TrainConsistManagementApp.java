import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

// Comparator to sort by capacity
class CapacityComparator implements Comparator<Bogie> {
    public int compare(Bogie b1, Bogie b2) {
        return Integer.compare(b1.capacity, b2.capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== UST - Sort Bogies by Capacity (Comparator) ===\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 30));

        // Before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Sort using Comparator
        Collections.sort(bogies, new CapacityComparator());

        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}
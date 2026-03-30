import java.util.*;
import java.util.stream.*;

// Bogie class
class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

// Functional Interface
interface SafetyCheck {
    boolean check(Bogie b);
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== UST - Safety Compliance Check for Goods Bogies ===\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Grain"));
        bogies.add(new Bogie("Open", "Coal"));
        bogies.add(new Bogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Lambda safety rule:
        // Cylindrical bogies must carry only Petroleum
        SafetyCheck rule = b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum");

        // Apply rule using allMatch()
        boolean isSafe = bogies.stream().allMatch(b -> rule.check(b));

        // Output result
        System.out.println("\nSafety Compliance Status: " + (isSafe ? "Safe" : "Unsafe"));

        System.out.println("\nUC12 safety validation completed...");
    }
}
import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== UST - Validate Train ID and Cargo Code ===\n");

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AA): ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Validation using matches()
        boolean isTrainValid = Pattern.matches(trainRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // Output
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        sc.close();
    }
}
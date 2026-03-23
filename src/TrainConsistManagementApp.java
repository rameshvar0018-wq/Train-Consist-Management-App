import java.util.ArrayList;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> train = new ArrayList<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + train.size());

        int choice;

        do {
            System.out.println("\n1. Add Bogie");
            System.out.println("2. Remove Bogie");
            System.out.println("3. Display Train");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter bogie name: ");
                    String b = sc.nextLine();
                    train.add(b);
                    break;

                case 2:
                    System.out.print("Enter bogie to remove: ");
                    String r = sc.nextLine();
                    train.remove(r);
                    break;

                case 3:
                    System.out.println("Train: " + train);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
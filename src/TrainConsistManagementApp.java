import java.util.ArrayList;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dynamic list for bogies
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
                    String bogie = sc.nextLine();
                    train.add(bogie);
                    System.out.println("Bogie added successfully.");
                    break;

                case 2:
                    if (train.isEmpty()) {
                        System.out.println("Train is empty.");
                    } else {
                        System.out.print("Enter bogie to remove: ");
                        String remove = sc.nextLine();

                        if (train.remove(remove)) {
                            System.out.println("Bogie removed successfully.");
                        } else {
                            System.out.println("Bogie not found.");
                        }
                    }
                    break;

                case 3:
                    if (train.isEmpty()) {
                        System.out.println("Train is empty.");
                    } else {
                        System.out.println("Current Train Consist:");
                        for (String b : train) {
                            System.out.println("- " + b);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
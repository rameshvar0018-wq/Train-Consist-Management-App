import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("======================================\n");

        // ✅ Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // ✅ Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println();

        // ✅ Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // ✅ Display sorted array
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println();
        System.out.println("UC17 sorting completed...");
    }
}
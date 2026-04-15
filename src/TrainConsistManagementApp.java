import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================\n");

        // ✅ Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ✅ Sort array (important for Binary Search)
        Arrays.sort(bogieIds);

        // ✅ Display sorted bogie IDs
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        System.out.println();

        // ✅ Bogie ID to search
        String searchId = "BG309";

        // ✅ BINARY SEARCH LOGIC
        int left = 0, right = bogieIds.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = bogieIds[mid].compareTo(searchId);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // ✅ Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " found using Binary Search.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
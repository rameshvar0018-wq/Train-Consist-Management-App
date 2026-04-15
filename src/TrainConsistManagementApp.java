public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("======================================\n");

        // ✅ Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // ✅ Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        // ✅ BUBBLE SORT LOGIC
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // ✅ Display sorted result
        System.out.println("Sorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n");
        System.out.println("UC16 sorting completed...");
    }
}
import java.util.*;

public class CamelCaravanBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] loadCapacity = new int[n];

            // Read the load capacities
            for (int i = 0; i < n; i++) {
                loadCapacity[i] = sc.nextInt();
            }

            // Sort the array
            Arrays.sort(loadCapacity);

            // Define the search range
            int low = loadCapacity[0] + loadCapacity[1]; // Smallest possible pair sum
            int high = loadCapacity[n - 1] + loadCapacity[n - 2]; // Largest possible pair sum
            int result = high;

            // Perform binary search
            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Check if it's feasible to pair with max load <= mid
                if (isFeasible(loadCapacity, mid)) {
                    result = mid; // Update result
                    high = mid - 1; // Try to minimize further
                } else {
                    low = mid + 1; // Increase range
                }
            }

            // Output the minimized maximum group load
            System.out.println(result);
        }
        sc.close();
    }

    // Feasibility function to check if max group load <= maxLoad
    private static boolean isFeasible(int[] loadCapacity, int maxLoad) {
        int start = 0;
        int end = loadCapacity.length - 1;

        // Try pairing the smallest and largest elements
        while (start < end) {
            int groupLoad = loadCapacity[start] + loadCapacity[end];
            if (groupLoad > maxLoad) {
                return false; // Group load exceeds the allowed maxLoad
            }
            start++;
            end--;
        }

        return true; // All pairs are valid
    }
}

import java.util.*;

public class SpiritEnergySorter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // Input number of cliffs
            int N = sc.nextInt();

            // Input cliff difficulty scores
            int[] cliffs = new int[N];
            for (int i = 0; i < N; i++) {
                cliffs[i] = sc.nextInt();
            }

            // Sort the cliffs based on spirit energy and difficulty
            List<int[]> cliffData = new ArrayList<>();
            for (int score : cliffs) {
                int spiritEnergy = countOnesInBinary(score);
                cliffData.add(new int[]{score, spiritEnergy});
            }

            // Sort by spirit energy, then by difficulty score
            cliffData.sort((a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]); // Compare by spirit energy
                }
                return Integer.compare(a[0], b[0]); // Compare by difficulty score
            });

            // Output the sorted cliff difficulty scores
            for (int[] cliff : cliffData) {
                System.out.print(cliff[0] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    // Function to count the number of 1's in the binary representation of a number
    private static int countOnesInBinary(int num) {
        return Integer.bitCount(num); // Java's built-in method for counting set bits
    }
}

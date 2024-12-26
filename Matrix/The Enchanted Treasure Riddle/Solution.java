import java.util.*;

public class UniValueGrid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int m = scanner.nextInt(); // Rows
            int n = scanner.nextInt(); // Columns
            int x = scanner.nextInt(); // Magical number

            int[][] grid = new int[m][n];
            List<Integer> flatList = new ArrayList<>();

            // Read the grid and flatten it into a list
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt();
                    flatList.add(grid[i][j]);
                }
            }

            // Check if transformation is possible
            int remainder = flatList.get(0) % x;
            boolean possible = true;
            for (int num : flatList) {
                if (num % x != remainder) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
                continue;
            }

            // Find minimum operations using median
            Collections.sort(flatList);
            int median = flatList.get(flatList.size() / 2);
            int operations = 0;

            for (int num : flatList) {
                operations += Math.abs(num - median) / x;
            }

            System.out.println(operations);
        }

        scanner.close();
    }
}

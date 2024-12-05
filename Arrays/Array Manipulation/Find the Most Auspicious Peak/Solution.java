import java.util.*;

public class LuckiestAuspiciousNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of peaks
            int M = sc.nextInt(); // Number of auspicious numbers

            int[] H = new int[N];
            int[] A = new int[M];

            int maxH = 0;
            int maxA = 0;

            for (int i = 0; i < N; i++) {
                H[i] = sc.nextInt();
                maxH = Math.max(maxH, H[i]);
            }

            for (int i = 0; i < M; i++) {
                A[i] = sc.nextInt();
                maxA = Math.max(maxA, A[i]);
            }

            int maxLimit = Math.max(maxH, maxA);
            int[] divCount = new int[maxLimit + 1];

            // Precompute divisor counts for all peaks
            for (int h : H) {
                for (int d = 1; d * d <= h; d++) {
                    if (h % d == 0) {
                        divCount[d]++;
                        if (d != h / d && h / d <= maxLimit) {
                            divCount[h / d]++;
                        }
                    }
                }
            }

            // Determine the auspicious number with the highest luckiness score
            int maxScore = -1;
            int result = Integer.MAX_VALUE;

            for (int a : A) {
                int score = (a <= maxLimit) ? divCount[a] : 0;

                if (score > maxScore || (score == maxScore && a < result)) {
                    maxScore = score;
                    result = a;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}

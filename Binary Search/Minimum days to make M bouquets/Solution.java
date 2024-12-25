class Solution {
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        int min = findMin(arr);
        int max = findMax(arr);
        int low = min;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeBouquets(arr, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low <= max ? low : -1;
    }

    public static boolean canMakeBouquets(int[] arr, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Function to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

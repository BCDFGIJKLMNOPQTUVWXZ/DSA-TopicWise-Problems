import java.util.*;

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // Sort the stalls array
        Arrays.sort(stalls);
        
        int n = stalls.length;
        int low = 1, high = stalls[n - 1] - stalls[0];
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    
    public static boolean canWePlace(int[] arr, int d, int k) {
        int cntCows = 1, last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= d) {
                cntCows++;
                last = arr[i];
            }
            
            if (cntCows >= k) return true;
        }
        return false;
    }
}

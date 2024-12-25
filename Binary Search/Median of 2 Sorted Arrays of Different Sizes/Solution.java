class Solution {
    public double medianOf2(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        
        if (m > n) {
            return medianOf2(b, a);
        }
          
        int low = 0;
        int high = m;
        int left = (m + n + 1) / 2;
        int totLen = m + n;
        
        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;
            
            int leftA = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int leftB = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            
            int rightA = (mid1 < m) ? a[mid1] : Integer.MAX_VALUE;
            int rightB = (mid2 < n) ? b[mid2] : Integer.MAX_VALUE;
            
            if (leftA <= rightB && leftB <= rightA) {
                if (totLen % 2 == 0) {
                    return (double)(Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2;
                } else {
                    return Math.max(leftA, leftB);
                }
            } else if (leftA > rightB) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0.0;
    }
}

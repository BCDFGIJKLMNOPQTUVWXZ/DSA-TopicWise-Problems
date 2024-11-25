public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here

        int low=0, high=n-1, mid=0, index=n;
        while(low<=high){
            mid=low+(high-low)/2;

            if(arr[mid] >= x){
                high=mid-1;
                index=mid;
            }
             
            else
              low=mid+1;
        }
        return index;
    }
}

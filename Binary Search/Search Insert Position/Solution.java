public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.

        int low=0, high=arr.length-1, mid=0, index=arr.length;
        while(low<=high){
        mid=low+(high-low)/2;

        if(arr[mid] >= m){
          high=mid-1;
          index=mid;
        }

        else
          low=mid+1;
      }
      return index;
    }
}

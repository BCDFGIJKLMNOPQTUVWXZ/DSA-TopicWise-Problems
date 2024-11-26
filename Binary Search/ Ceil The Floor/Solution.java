import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.

      int[] resArr=new int[2];
      int low=0, high=n-1, mid=0, floor=-1;
      //getting floor 
      while(low<=high){
        mid=low+(high-low)/2;

        if(a[mid] <= x){
          low=mid+1;
          floor=a[mid];
        }

        else
          high=mid-1;
      }
      resArr[0]=floor;
      low=0;
      high=n-1;
      int ceil=-1;
      //getting ceil 
      while(low<=high){
        mid=low+(high-low)/2;

        if(a[mid] >= x){
          high=mid-1;
          ceil=a[mid];
        }

        else
          low=mid+1;
      }
      resArr[1]=ceil;

      return resArr;

    }
    
}

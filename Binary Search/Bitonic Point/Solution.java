class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
       
        int low=0, high=n-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(mid>0 && mid<n-1){
                if(arr[mid+1] < arr[mid] && arr[mid] > arr[mid-1])
                   return arr[mid];
                else if(arr[mid-1] > arr[mid])
                   high=mid-1;
              
                else
                   low=mid+1;
            }
            else if(mid == 0){
                if(arr[mid] > arr[mid+1])
                   return arr[mid];
            }
            else{
                if(arr[mid] > arr[mid-1])
                   return arr[mid];
            }
            
        }
        return 0;
    }
}

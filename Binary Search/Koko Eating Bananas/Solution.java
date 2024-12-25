class Solution {
    public static int kokoEat(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=1, high=findMax(arr), res=0;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(eatBanana(arr, k, mid)){
               res=mid;
               high=mid-1;
            }
            else
               low=mid+1;
        }
        return res;
    }
    
    public static boolean eatBanana(int[] arr, int k, int banana){
        int hrs=0, n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] > banana){
                if(arr[i] % banana != 0)
                    hrs+=arr[i]/banana+1;
                else
                    hrs+=arr[i]/banana;
            }
            else
               hrs++;
        }
        return (hrs <= k) ? true : false;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}

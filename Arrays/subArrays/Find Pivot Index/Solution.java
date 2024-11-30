class Solution {
    public int pivotIndex(int[] nums) {
        int pivot=0, n=nums.length, totSum=0;
        for(int i=0; i<n; i++){
            totSum+=nums[i];
        }
        int sumRight=0, sumLeft=totSum-nums[0];
        while(pivot<n){
            if(sumRight == sumLeft)
              return pivot;
            else{
                sumRight+=nums[pivot];
                ++pivot;
                if (pivot == n) 
                   sumLeft = 0;
                else 
                   sumLeft -= nums[pivot];
            }
        }
        return -1;
    }
}

class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        // code here
        
        int left = 0, right = 0; 
        int zeroCount = 0; 
        int maxLength = 0, length=0; 
        while (right < arr.length) { 
            if (arr[right] == 0) { 
                zeroCount++; 
                
           } 
           
           if(zeroCount > k) { 
               if (arr[left] == 0)
                   zeroCount--;
               left++; 
            } 
            
            if(zeroCount <= k)
               length=right-left+1;
            maxLength = Math.max(maxLength, right - left + 1); 
            right++; 
            
        } 
        return maxLength;
        
    }
}

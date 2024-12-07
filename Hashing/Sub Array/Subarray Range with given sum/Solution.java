class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int cnt=0, preSum=0;
        HashMap <Integer, Integer> hmap=new HashMap<> ();
        hmap.put(0,1);
        
        for(int i=0; i<arr.length; i++){
            preSum+=arr[i];
            
            if(hmap.containsKey(preSum-tar)){
                cnt+=hmap.get(preSum-tar);
            }
            
            hmap.put(preSum, hmap.getOrDefault(preSum, 0)+1);
        }
        
        return cnt;
    }
}

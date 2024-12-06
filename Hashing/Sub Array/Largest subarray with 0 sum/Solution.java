class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap <Integer, Integer> map=new HashMap <>();
        int sum=0, maxLen=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0)
              maxLen=i+1;
            else{
                if(map.containsKey(sum))
                   maxLen=Math.max(maxLen, i-map.get(sum));
                else
                   map.put(sum,i);
            }
        }
        return maxLen;
    }
}

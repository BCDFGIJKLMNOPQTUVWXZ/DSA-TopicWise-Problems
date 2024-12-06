class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        
        int n=arr.length, totSum=0, tarSum=0, sum=0, cnt=1;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            totSum+=arr[i];
        }
        
        tarSum=totSum/3;
        
        if(totSum%3 != 0){
            list.add(-1);
            list.add(-1);
            return list;
        }
          
        
        for(int i=0; i<n; i++){
            sum+=arr[i];
            
            if(sum == tarSum && cnt<=2){
                list.add(i);
                cnt++;
                sum=0;
            }
            
            if(sum > tarSum){
                list.add(-1);
                list.add(-1);
                return list;
            }
        }
          
        if(sum==tarSum)
        return list;
        
        else{
            list.add(-1);
            list.add(-1);
            return list;
        }
    }
}ml

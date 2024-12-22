class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1=a.length;
        int n2=b.length;
        
        if(n1>n2)
          return kthElement(b, a, k);
          
        int low=Math.max(0, k-n2);
        int high=Math.min(k, n1);
        
        while(low <= high){
            int cutA=(low+high)/2;
            int cutB=k-cutA;
            
            int leftA= (cutA>0) ? a[cutA-1] : Integer.MIN_VALUE;
            int leftB= (cutB>0) ? b[cutB-1] : Integer.MIN_VALUE;
            
            int rightA= (cutA<n1) ? a[cutA] : Integer.MAX_VALUE;
            int rightB= (cutB<n2) ? b[cutB] : Integer.MAX_VALUE;
            
            if(leftA <= rightB && leftB <= rightA){
                return Math.max(leftA, leftB);
            }else if(leftA > rightB){
                  high=cutA-1;
            }else{
                low=cutA+1;
            }     
        }
        return -1;
    }
}

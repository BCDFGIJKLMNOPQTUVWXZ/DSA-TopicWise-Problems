class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int low=0, high=arr.length-1,temp=0;
        while(low<=high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            
            low++;
            high--;
        }
    }
}

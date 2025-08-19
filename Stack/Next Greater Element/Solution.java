class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> nge = new ArrayList<>(Collections.nCopies(arr.length, -1));
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr.length - 1);
        
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                nge.set(i, arr[stack.peek()]);
            }
            
            stack.push(i);
        }
        
        return nge;
    }
}

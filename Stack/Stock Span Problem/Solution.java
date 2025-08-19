class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> span = new ArrayList<>();
        span.add(1);
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        
        for(int i = 1; i < n; i++){
            int spanVal = 1;
            
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                spanVal += span.get(stack.peek());
                stack.pop();
            }
            
            stack.push(i);
            span.add(spanVal);
        }
        
        return span;
    }
}

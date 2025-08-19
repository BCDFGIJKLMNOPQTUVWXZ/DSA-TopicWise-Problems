import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> previousGreaterElement(int[] arr) {
        ArrayList<Integer> pge = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        // Start from the beginning of the array and go forwards
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack that are less than or equal to the current element
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            
            // If the stack is not empty, the top element is the previous greater
            if (!stack.isEmpty()) {
                pge.add(arr[stack.peek()]);
            } else {
                pge.add(-1);
            }
            
            // Push the current element's index onto the stack
            stack.push(i);
        }
        
        return pge;
    }
}

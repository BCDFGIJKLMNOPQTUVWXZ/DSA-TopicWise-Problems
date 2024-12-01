class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0; // Pointer to track the position for non-zero elements
        
        // Traverse the array
        for (int j = 0; j < arr.length; j++) {
            // If the current element is non-zero, swap with the position at 'i'
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // Increment i to point to the next position for non-zero
            }
        }
    }
}

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here.
        int max = Arrays.stream(arr).max().getAsInt();
        int max2 = Integer.MIN_VALUE; // Initialize second largest to minimum value
        boolean foundSecondLargest = false;

        // Loop through the array to find the second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > max2) {
                max2 = arr[i];
                foundSecondLargest = true; // Mark that we found a valid second largest
            }
        }

        // Return -1 if no second largest is found
        return foundSecondLargest ? max2 : -1;
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0, n=arr.length;
        for(int i=0; i<n; i++){
           sum+=(((i+1)*(n-i)+1)/2)*arr[i];
        }
        return sum;
    }
}

//Time Complexity: O(n²).
// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int n = arr.length;
//         int totalSum = 0;

//         // Iterate over all possible starting indices
//         for (int i = 0; i < n; i++) {
//             int runningSum = 0;

//             // Iterate over all possible ending indices
//             for (int j = i; j < n; j++) {
//                 runningSum += arr[j]; // Add current element to the running sum

//                 // Check if the length of the current subarray is odd
//                 if ((j - i + 1) % 2 == 1) {
//                     totalSum += runningSum; // Add running sum to totalSum
//                 }
//             }
//         }

//         return totalSum;
//     }
// }

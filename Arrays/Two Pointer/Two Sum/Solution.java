import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return new int[] {}; // Return empty array if no solution is found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();

        System.out.println("Enter a target value:");
        int target = sc.nextInt();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = obj.twoSum(arr, target);
        if (result.length == 0) {
            System.out.println("No solution found!");
        } else {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
        sc.close();
    }
}

import java.util.*;

class Solution {

    public void rotateArray(int[] nums, int k) {
        int n = nums.length; // Size of array
        k = k % n; // To avoid unnecessary rotations

        int[] temp = new int[k];

        // Store first k elements in a temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift n-k elements of given array to the front
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Copy back the k elements at the end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}

class RotateByK {
    // Helper function to print the array
    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        System.out.println("Initial array: ");
        printArray(nums);
        Solution sol = new Solution();
        sol.rotateArray(nums, k);

        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
}
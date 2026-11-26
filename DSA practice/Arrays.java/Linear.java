
import java.util.*;

class Solution {

    // Find the first occurrence of the target.
    public int linearSearch(int[] nums, int target) {

        // Examine elements from left to right.
        for (int i = 0; i < nums.length; i++) {

            // Check whether this element matches the target.
            if (nums[i] == target) {

                // Return the smallest matching index.
                return i;
            }
        }

        // No element matched the target.
        return -1;
    }
}

public class Linear {
    public static void main(String[] args) {

        // Use the values from the first example.
        int[] nums = { 2, 3, 4, 5, 3 };
        int target = 3;

        // Create an object and find the first matching index.
        Solution obj = new Solution();
        int result = obj.linearSearch(nums, target);

        // Print the returned index.
        System.out.println(result);
    }
}

class Solution {
    int jump(int[] nums) {
        // Initialize number of jumps
        int jumps = 0;
        // Track farthest reachable index
        int farthest = 0;
        // Track end of current range
        int currentEnd = 0;

        // Traverse all elements except last
        for (int i = 0; i < nums.length - 1; i++) {
            // Update farthest reachable
            farthest = Math.max(farthest, i + nums[i]);

            // If reached the end of current range
            if (i == currentEnd) {
                // Take a jump
                jumps++;
                // Extend the range
                currentEnd = farthest;
            }
        }

        // Return total jumps
        return jumps;
    }
}

public class JumpGame2 {
    public static void main(String[] args) {
        // Example input
        int[] nums = { 2, 3, 1, 1, 4 };
        // Create solution
        Solution sol = new Solution();
        // Print result
        System.out.println(sol.jump(nums)); // Output: 2
    }
}
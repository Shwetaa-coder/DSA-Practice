import java.util.*;

class Largest {
    public static int largestElement(int[] nums) {

        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 2 };

        // Make an intance of the Solution class
        Largest sol = new Largest();

        int largest = sol.largestElement(nums);

        // Print the largest element.
        System.out.print(largest);
    }
}
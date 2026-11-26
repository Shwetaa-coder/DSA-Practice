import java.io.*;

class SecLargest {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }

        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 7, 7, 5 };
        SecLargest sol = new SecLargest();

        int n = nums.length;
        int sL = sol.secondLargestElement(nums);

        System.out.println("Second largest is " + sL);
    }
}
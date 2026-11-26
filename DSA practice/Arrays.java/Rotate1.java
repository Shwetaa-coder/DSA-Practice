class Rotate1 {
    public void rotateArrayByOne(int[] nums) {

        int temp = nums[0];

        // Shift elements to the left
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        // Place the first element at the end
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        Rotate1 solution = new Rotate1();
        int[] nums = { 1, 2, 3, 4, 5 };

        solution.rotateArrayByOne(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
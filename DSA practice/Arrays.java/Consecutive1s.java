import java.util.*;

class Consecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);

            } else {
                cnt = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 0, 1, 1, 1 };

        Consecutive1s sol = new Consecutive1s();
        int ans = sol.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}
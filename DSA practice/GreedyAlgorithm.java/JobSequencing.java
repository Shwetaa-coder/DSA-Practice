import java.util.*;

class Solution {
    public int[] jobScheduling(int[][] Jobs) {
        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);
        int n = Jobs.length;
        int max = -1; // maximum deadline
        for (int[] i : Jobs) {
            max = Math.max(max, i[1]);
        }
        int[] arr = new int[max];
        Arrays.fill(arr, -1);
        int c = 0; // count
        int p = 0; // total profit
        for (int i = 0; i < n; i++) {
            for (int j = Jobs[i][1] - 1; j >= 0; j--) {
                if (arr[j] == -1) {
                    c++;
                    arr[j] = Jobs[i][0];
                    p += Jobs[i][2];
                    break;
                }
            }
        }
        return new int[] { c, p };

    }
}

public class JobSequencing {

    public static void main(String[] args) {
        int[][] jobs = { { 1, 4, 20 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 1, 30 } };

        Solution solution = new Solution();
        int[] result = solution.jobScheduling(jobs);

        // Output the result
        System.out.println("Number of Jobs: " + result[0]);
        System.out.println("Maximum Profit: " + result[1]);
    }

}

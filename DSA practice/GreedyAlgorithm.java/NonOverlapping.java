import java.util.*;

class Solution {

    public static int comp(int[] val1, int[] val2) {

        return Integer.compare(val1[1], val2[1]);
    }

    public int MaximumNonOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, Solution::comp);
        int n = intervals.length;

        int cnt = 1;

        // Keep track of the ending time
        int lastEndTime = intervals[0][1];

        // Iterate through all intervals
        for (int i = 1; i < n; i++) {

            if (intervals[i][0] >= lastEndTime) {
                // Increment counter
                cnt++;
                // Update the ending time
                lastEndTime = intervals[i][1];
            }
        }
        return n - cnt;
    }
}

// Main class
class NonOverlapping {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] intervals = { { 0, 5 }, { 3, 4 }, { 1, 2 }, { 5, 9 }, { 7, 9 } };

        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Interval " + (i + 1) + " Start: " + intervals[i][0] + " End: " + intervals[i][1]);
        }

        int ans = obj.MaximumNonOverlappingIntervals(intervals);
        System.out.println("Maximum Non-Overlapping Intervals: " + ans);
    }
}

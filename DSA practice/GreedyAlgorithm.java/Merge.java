import java.util.*;

class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        // Sort intervals based on start value
        intervals.sort((a, b) -> a.get(0) - b.get(0));

        // List to store merged intervals
        List<List<Integer>> merged = new ArrayList<>();

        // Traverse all intervals
        for (List<Integer> interval : intervals) {
            // If merged is empty or no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval.get(0)) {
                merged.add(new ArrayList<>(interval));
            }
            // If overlap, merge intervals
            else {
                List<Integer> last = merged.get(merged.size() - 1);
                last.set(1, Math.max(last.get(1), interval.get(1)));
            }
        }
        return merged;
    }
}

class Merge {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1, 3), Arrays.asList(2, 6),
                Arrays.asList(8, 10), Arrays.asList(15, 18));
        System.out.println(sol.merge(intervals));
    }
}
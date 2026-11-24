import java.util.*;

class Solution {
    public void reverseString(List<Character> s) {
        int start = 0, end = s.size() - 1;

        while (start < end) {
            char ch = s.get(start);
            s.set(start, s.get(end));
            s.set(end, ch);
            start++;
            end--;
        }
    }
}

class Reverse2 {
    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        Solution sol = new Solution();
        sol.reverseString(str);
        for (char c : str) {
            System.out.print(c);
        }
    }
}
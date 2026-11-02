import java.util.*;

class Solution {

    private void reverse(ArrayList<Character> s, int left, int right) {
        if (left >= right)
            return;
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s, left + 1, right - 1);
    }

    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        reverse(s, left, right);
        return s;
    }
}

class ReverseString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        // Function call to reverse the given string
        ArrayList<Character> reversed = solution.reverseString(s);
        System.out.println(reversed);
    }
}
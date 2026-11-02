class SumOfNumbers {
    public int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }
}

public class Sum {
    public static void main(String a[]) {
        SumOfNumbers s = new SumOfNumbers();
        int res = s.sum(4);
        System.out.println("Sum : " + res);
    }
}

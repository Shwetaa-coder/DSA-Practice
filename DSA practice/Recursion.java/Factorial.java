class Fact {
    public int sum(int n) {
        if (n < 1)
            return 0;
        return n * sum(n - 1);
    }
}

public class Factorial {
    public static void main(String a[]) {
        SumOfNumbers s = new SumOfNumbers();
        int res = s.sum(4);
        System.out.println("Factorial : " + res);
    }
}

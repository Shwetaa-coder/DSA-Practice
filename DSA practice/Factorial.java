class Fact {
    public int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

public class Factorial {
    public static void main(String a[]) {
        Fact r = new Fact();
        int res = r.fact(3);
        System.out.println("Factorial : " + res);

    }

}

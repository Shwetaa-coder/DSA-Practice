class P {
    public boolean isPrime(int n) {
        int count = 0;
        if (n < 0)
            return false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}

public class Prime {
    public static void main(String a[]) {
        P p = new P();
        boolean res = p.isPrime(-7);
        System.out.println(res);
    }
}

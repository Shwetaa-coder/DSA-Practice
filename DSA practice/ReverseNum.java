class Rev {
    public int reverse(int n) {
        int d = 0, sum = 0;
        while (n > 0)

        {
            d = n % 10;
            sum = sum * 10 + d;
            n = n / 10;
        }
        return sum;
    }
}

public class ReverseNum {
    public static void main(String a[]) {
        Rev r = new Rev();
        int res = r.reverse(789);
        System.out.println("Count of all digits of the number : " + res);

    }
}

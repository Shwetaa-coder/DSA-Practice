class Pal {
    public int pal(int n) {
        int num = n;
        int d = 0, sum = 0;
        while (n > 0)

        {
            d = n % 10;
            sum = sum * 10 + d;
            n = n / 10;
        }
        if (num == sum)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
        return sum;
    }
}

public class Palindrome {
    public static void main(String a[]) {
        Pal r = new Pal();
        int res = r.pal(789);

    }
}

class Lar {
    public int largest(int n) {

        int d = 0, largest = 0;
        while (n > 0)

        {
            d = n % 10;
            if (d > largest)
                largest = d;
            n = n / 10;
        }
        return largest;
    }
}

public class LargestDigit {
    public static void main(String a[]) {
        Lar r = new Lar();
        int res = r.largest(789);
        System.out.println("Largest digit : " + res);

    }
}

class Count {

    public int countnum(int n) {
        int digit = 0;
        int count = 0;
        while (n > 0) {
            digit = n % 10;
            count++;
            n = n / 10;

        }
        return count;
    }
}

class CountAllDigitsOfANumber {
    public static void main(String a[]) {
        Count c = new Count();
        int result = c.countnum(87524);
        System.out.println("Count of all digits of the number : " + result);
    }
}
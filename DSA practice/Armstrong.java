
class Arm {

    public boolean isArm(int n) {

        int num = n;
        int temp = n;
        int digit = 0;
        int count = 0;
        int d = 0;
        int sum = 0;

        // Count the digits
        while (temp > 0) {
            digit = temp % 10;
            count++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = n;

        while (temp > 0) {
            d = temp % 10;
            sum = (int) (sum + Math.pow(d, count));
            temp = temp / 10;
        }

        if (num == sum)
            return true;
        else
            return false;
    }
}

public class Armstrong {

    public static void main(String a[]) {

        Arm obj = new Arm();

        boolean res = obj.isArm(153);

        System.out.println(res);
    }
}

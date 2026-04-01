import java.util.Scanner;

public class Problem2 {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == x)
                return mid;
            else if ((long) mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(mySqrt(x));
        sc.close();
    }
}
import java.util.Scanner;

public class Problem1 {

    static int pick = 6;

    public static int guess(int num) {
        if (num > pick)
            return -1;
        else if (num < pick)
            return 1;
        else
            return 0;
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);

            if (result == 0)
                return mid;
            else if (result == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(guessNumber(n));
        sc.close();
    }
}
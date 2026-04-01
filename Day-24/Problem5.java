import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canShip(int[] weights, int days, int capacity) {
        int d = 1, current = 0;
        for (int w : weights) {
            if (current + w > capacity) {
                d++;
                current = 0;
            }
            current += w;
        }
        return d <= days;
    }
}
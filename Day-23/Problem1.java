import java.util.*;
public class Problem1 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Problem5 obj = new Problem5();
        double result = obj.findMaxAverage(nums, k);
        System.out.println("Maximum Average = " + result);
        sc.close();
    }
}
public class Problem8 {

    public static int longestSubarray(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean deleted = false;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 1) {
                    count++;
                } else if (!deleted) {
                    deleted = true;
                } else {
                    break;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max == nums.length ? max - 1 : max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1};

        System.out.println(longestSubarray(nums));
    }
}
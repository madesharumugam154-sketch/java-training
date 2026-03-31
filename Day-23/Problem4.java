public class Problem4 {

    public static int characterReplacement(String s, int k) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            int maxFreq = 0;

            for (int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, count[s.charAt(j) - 'A']);

                if ((j - i + 1) - maxFreq <= k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;

        System.out.println(characterReplacement(s, k));
    }
}
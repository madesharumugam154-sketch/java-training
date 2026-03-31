import java.util.Arrays;

public class Problem3 {

    public static boolean checkInclusion(String s1, String s2) {

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            char[] b = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
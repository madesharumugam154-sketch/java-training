public class Problem6 {

    public static String minWindow(String s, String t) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);

                boolean found = true;

                for (int k = 0; k < t.length(); k++) {
                    if (!sub.contains(String.valueOf(t.charAt(k)))) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    if (ans.equals("") || sub.length() < ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}
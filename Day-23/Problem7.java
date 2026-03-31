public class Problem7 {

    public static int totalFruit(int[] fruits) {
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {
            int type1 = fruits[i];
            int type2 = -1;
            int count = 0;

            for (int j = i; j < fruits.length; j++) {
                if (fruits[j] == type1) {
                    count++;
                } else if (type2 == -1 || fruits[j] == type2) {
                    type2 = fruits[j];
                    count++;
                } else {
                    break;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};

        System.out.println(totalFruit(fruits));
    }
}
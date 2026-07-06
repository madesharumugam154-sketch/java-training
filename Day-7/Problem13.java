import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int positive = 0, negative = 0;
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0)
                positive++;
            else
                negative++;
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}
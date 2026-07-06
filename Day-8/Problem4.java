import java.util.Scanner;
public class Problem4 {
    public static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Square = " + square(n));
    }
}
import java.util.Scanner;
public class Problem2 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result = add(a, b);
        System.out.println("Sum = " + result);
    }
}
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int p = sc.nextInt();
        System.out.print("Enter Rate: ");
        int r = sc.nextInt();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        System.out.println("Simple Interest = " + (p * r * t / 100));
    }
}
import java.util.Scanner;
public class Problem7 {
    public static int area(int length, int breadth) {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println("Area = " + area(length, breadth));
    }
}
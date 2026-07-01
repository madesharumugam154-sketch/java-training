import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int[] copy=new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<5;i++)
            copy[i]=arr[i];
        for(int i=0;i<5;i++)
            System.out.print(copy[i]+" ");
    }
}
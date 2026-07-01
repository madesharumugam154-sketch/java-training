import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        for(int i=1;i<5;i+=2)
            System.out.print(arr[i]+" ");
    }
}
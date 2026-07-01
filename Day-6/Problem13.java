import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int pos=0,neg=0;
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]>=0)
                pos++;
            else
                neg++;
        }
        System.out.println("Positive = "+pos);
        System.out.println("Negative = "+neg);
    }
}
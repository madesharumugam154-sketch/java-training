import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
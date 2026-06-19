import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrays");

        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter Elements of Array");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            for(int n = i+1; n<arr.length; n++){
                if(arr[i] == arr[n]){
                   System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
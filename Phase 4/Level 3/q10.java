import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");

        int x = sc.nextInt();
        int arr[] = new int[x];
        int count = 0; // No need.

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int cpy[] = new int [arr.length];

        for(int i = 0; i<cpy.length; i++){
            cpy[i] = arr[i];
            count++; // Only for removiing yellow line in VS code.
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println(" ");

        for(int ele : cpy){
            System.out.print(ele + " ");
        }
    }
}
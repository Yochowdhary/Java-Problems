import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrays");

        int x = sc.nextInt();
        int arr1[] = new int[x];
        System.out.println("Enter Elements of 1st Array");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[x];
        System.out.println("Enter Elements of 2nd Array");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] * arr2[i] + " ");      
        }
    }
}
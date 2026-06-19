import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrays");

        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter Elements of Array");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i = 0; i<arr.length-1; i++){
            for(int n = 0; n<arr.length; n++)
            if(arr[i] < arr[n]){
                largest = arr[i+1];
            }
        }

        System.out.println(largest);
    }
}
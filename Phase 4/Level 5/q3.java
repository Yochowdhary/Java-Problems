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

        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != largest && arr[i]>seclargest){
                seclargest = arr[i];
            }
        }
        System.out.println(seclargest);
    }
}
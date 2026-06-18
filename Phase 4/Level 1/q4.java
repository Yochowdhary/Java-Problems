import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int x = input.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int maxfinder = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxfinder){
                maxfinder = arr[i];
            }
        }
        System.out.println("The max number in the array is " + maxfinder);
    }
}
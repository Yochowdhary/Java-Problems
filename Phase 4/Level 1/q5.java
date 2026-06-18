import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int x = input.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int minfinder = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<minfinder){
                minfinder = arr[i];
            }
        }
        System.out.println("The max number in the array is " + minfinder);
    }
}
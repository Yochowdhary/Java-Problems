import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of Array");

        int x = input.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        arr[0] = arr[0] + arr[arr.length-1];              //Formula for Swapping digits 
        arr[arr.length-1] = arr[0] - arr[arr.length-1];   // a = a+b;
        arr[0] = arr[0] - arr[arr.length-1] ;            // b = a-b;
                                                        // a = a-b;

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of Array");

        int x = input.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){ // Replacing even with 1.
                arr[i] = 1;
            }
            else{
                arr[i] = 0; // Else replacing with 0.
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
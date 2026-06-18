import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of Array");

        int x = input.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
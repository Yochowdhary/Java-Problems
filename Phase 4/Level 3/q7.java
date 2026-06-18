import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");

        int x = sc.nextInt();
        int arr[] = new int[x];
        int first;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        first = arr[0];

        for(int i = 0; i<arr.length-1; i++){ //Run the loop till 2nd last element only.
            arr[i] = arr[i+1];
        }
        arr[x-1] = first;

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
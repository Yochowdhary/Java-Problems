import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in Array");

        int x = sc.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sqrarr[] = new int[arr.length];

        for(int i = 0; i<sqrarr.length; i++){
            if(arr[i] % 2 == 0){
            sqrarr[i] = arr[i];
            }
        }

        for(int ele : arr){
            System.out.print(" " + ele);
        }
        System.out.println("          ");

        for(int ele : sqrarr){
            System.out.print(" " + ele);
        }
    }
}
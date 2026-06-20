import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrray");

        int x = sc.nextInt();
        int arr[] = new int[x];
        int sum = 0;
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int avg = sum/arr.length;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > avg){
                count++;
            }
        }

        System.out.println(count+" is the no. of elements which is larger than the Avg");


    }
}
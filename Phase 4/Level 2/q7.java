import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }

        System.out.println("The sum of Odd digtis in the Arrays are " + sum);
    }
}
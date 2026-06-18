import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the no. of elements ");

        int x = input.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<=x-1; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i<= x-1; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
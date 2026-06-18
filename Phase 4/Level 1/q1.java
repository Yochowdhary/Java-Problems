import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = input.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<=n-1; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i<=n-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
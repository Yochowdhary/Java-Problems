import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of terms n");
        int n = input.nextInt();

        System.out.println("Enter the Starting number");
        int a = input.nextInt();

        System.out.println("Enter the Difference");
        int d = input.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
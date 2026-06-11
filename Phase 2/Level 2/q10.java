import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms");

        int n = input.nextInt();

        int a = 0;
        int b = 1;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            sum += a;

            int c = a + b;

            a = b;
            b = c;
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the nth Element for Fibonacci");

        int x = input.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= x; i++) {

            System.out.print(a + " ");

            int c = a + b;

            a = b;
            b = c;
        }
    }
}
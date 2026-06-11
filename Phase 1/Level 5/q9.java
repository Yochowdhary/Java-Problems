import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first date (day month):");
        int d1 = input.nextInt();
        int m1 = input.nextInt();

        System.out.println("Enter second date (day month):");
        int d2 = input.nextInt();
        int m2 = input.nextInt();

        if (m1 < m2) {
            System.out.println("First date comes first");
        }
        else if (m1 > m2) {
            System.out.println("Second date comes first");
        }
        else {
            if (d1 < d2) {
                System.out.println("First date comes first");
            }
            else if (d1 > d2) {
                System.out.println("Second date comes first");
            }
            else {
                System.out.println("Both dates are same");
            }
        }
    }
}
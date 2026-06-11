import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weekday number");

        int num = input.nextInt();

        switch(num) {
            case 0 -> System.out.println("Weekend");

            case 1 -> System.out.println("Weekday");

            case 2 -> System.out.println("Weekday");

            case 3 -> System.out.println("Weekday");

            case 4 -> System.out.println("Weekday");

            case 5 -> System.out.println("Weekday");

            case 6 -> System.out.println("Weekday");

            case 7 -> System.out.println("Weekend");

            default -> System.out.println("Invalid Input");
        }
    }
}
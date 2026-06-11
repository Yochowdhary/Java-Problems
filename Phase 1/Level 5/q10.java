import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        int century = (year - 1) / 100 + 1;

        if (century % 10 == 1 && century % 100 != 11) {
            System.out.println(century + "st century");
        }
        else if (century % 10 == 2 && century % 100 != 12) {
            System.out.println(century + "nd century");
        }
        else if (century % 10 == 3 && century % 100 != 13) {
            System.out.println(century + "rd century");
        }
        else {
            System.out.println(century + "th century");
        }
    }
}
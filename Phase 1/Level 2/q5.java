
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x;

        System.err.println("Enter the 1st number");
        x = input.nextFloat();

        if (x < 12 && x >= 6) {
            System.err.println("Good Morning");
        } else if (x < 16 && x >= 12) {
            System.err.println("Good Afternoon");
        } else if (x < 18 && x >= 16) {
            System.err.println("Good Evening");
        } else if ((x < 24 && x >= 18)) {
            System.err.println("Good Night");
        }
    }
}

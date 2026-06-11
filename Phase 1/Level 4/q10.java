
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String");

        String x = input.next();

        if (x.length() > 8 && x.matches(".*\\d.*")) {
            System.out.println("Length is more than 8 and contains number");
        }
    }
}

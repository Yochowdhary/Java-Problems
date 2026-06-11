import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-digit number:");
        int num = input.nextInt();

        int[] digit = new int[3];

        digit[0] = num / 100;          
        digit[1] = (num / 10) % 10;   
        digit[2] = num % 10;          

        if (digit[0] != digit[1] &&
            digit[1] != digit[2] &&
            digit[0] != digit[2]) {

            System.out.println("All digits are distinct");
        } else {
            System.out.println("Digits are not distinct");
        }
    }
}
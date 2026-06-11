import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-digit number:");
        int num = input.nextInt();

        int[] digit = new int[4];

        digit[0] = num / 1000;          // first digit
        digit[1] = (num / 100) % 10;
        digit[2] = (num / 100) % 10;
        digit[3] = num % 10;          // third digit

        if (digit[0] == digit[3]){
            System.out.println("First and last are same");
            }
        else {
            System.out.println("First and last are distinct");
        }
    }
}
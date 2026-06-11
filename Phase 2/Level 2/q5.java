import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check Armstrong or not");
        int x = input.nextInt();
        int org = x;
        int square;
        int sum = 0;

        while(x>0){
            int digit = x%10;
            square = digit*digit*digit;
            sum +=square;
            x = x/10;
        }

        if(org == sum){
            System.out.println(org + " is Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
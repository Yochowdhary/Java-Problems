import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to check Palindrome");
        int x = input.nextInt();
        int digit;
        int rev = 0;
        int org = x;

        while(x>0){
            digit = x%10;
            rev = rev * 10 + digit;
            x = x/10;
        }

        if(org == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
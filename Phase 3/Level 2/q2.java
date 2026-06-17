import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter the number ");

        int x = input.nextInt();
        int result = reverse(x,rev);
        System.out.println(result);
    }

    public static int reverse(int x, int rev){
        if(x<=0){
            return rev;
        }
        int digit = x%10;
        rev = rev * 10 + digit;
        x /= 10;
        return reverse(x, rev);

    }
}
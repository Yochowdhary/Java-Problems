import java.util.Scanner;

public class q8{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbr ");

        int x = input.nextInt();

        int evn = 0;
        int odd = 0;

        while(x>0){
            int digit = x%10;
            if(digit%2==0){
                evn += digit;
            }
            else{
                odd += digit;
            }
        x = x / 10;

        }
        System.out.println("Even digits are " + evn);
        System.out.println("Odd digits are " + odd);
    }
}
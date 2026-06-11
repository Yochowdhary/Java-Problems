import java.util.Scanner;

public class q2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int x = input.nextInt();
        int digit;

        while(x>0){
            digit = x%10;
            System.out.print(digit);
            x = x/10;         
        }
    }
}
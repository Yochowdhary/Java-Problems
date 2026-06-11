import java.util.Scanner;

public class q8 {
    public static void main(String [] args){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int sum = 0;
        int product = 1;

        while(x > 0){

          int digit = x%10;
          sum = sum + digit;
          product = product + digit;

          x = x/10;
        }

        if(sum>product){
            System.out.println("Yes sum is Greater");
        }
        else{
            System.out.println("No sum is lesser");
        }
    }
}
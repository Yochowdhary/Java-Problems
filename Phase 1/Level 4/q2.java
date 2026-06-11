import java.util.Scanner;

public class q2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Number");
        int x = input.nextInt();

        if(x%3==0){
            System.out.print("Fizz");
            if(x%5==0){
                System.out.print("Buzz");
                return;
            }
        }
        if(x%5==0){
            System.out.println("Buzz");
        }
    }
}
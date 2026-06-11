import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to find the Sum ");
        int x = input.nextInt();
        int y = 0;

        while(x>0){
            int digit = x%10;
            y = y+digit;
            x = x/10;
        }
        System.out.println("The sum is "+y);   
    }
}
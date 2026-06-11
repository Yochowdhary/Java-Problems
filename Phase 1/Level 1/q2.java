import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Number");
        x = input.nextInt();
        
        if(x%2 == 0){
            System.err.println("Number is Even: " + x);
        }
        else {
            System.err.println("Number is Odd: " + x);
        }
    }
}
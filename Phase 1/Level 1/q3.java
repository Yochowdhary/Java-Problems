import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Number");
        x = input.nextInt();
        
        if(x%5 == 0){
            System.err.println("Number is Divisible by 5: " + x);
        }
        else {
            System.err.println("Number is not Divisible by 5: " + x);
        }
    }
}
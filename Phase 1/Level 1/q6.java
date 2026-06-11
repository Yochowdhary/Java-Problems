import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.err.println("Enter the 1st number");
        x = input.nextInt();

        System.err.println("Enter the 2nd number");
        y = input.nextInt();
        
        if(x<=y){
            System.err.println("Larger number is: " + y);
        }
        else {
            System.err.println("Learger number is: " + x);
        }
    }
}
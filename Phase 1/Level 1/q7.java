import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.err.println("Enter the 1st number");
        x = input.nextInt();

        System.err.println("Enter the 2nd number");
        y = input.nextInt();
        
        System.err.println("Enter the 3rd number");
        z = input.nextInt();
        
        int larger = x;

        if(larger>y){
            System.err.println("Larger number is: " + larger);
            return;
        }
        else {
            larger = y; 
        }

        if(larger>z){
            System.err.println("Larger number is: " + larger);
            return;
        }
        else {
            larger = z; 
        }

        if(larger>x){
            System.err.println("Larger number is: " + larger);
        }
        
    }
}
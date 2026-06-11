import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.err.println("Enter the 1st number");
        x = input.nextInt();

        System.err.println("Enter the 2nd number");
        y = input.nextInt();
        
        if(x%y == 0 || y%x == 0){
            System.err.println("Multiple of each other");
        }
        else {
            System.err.println("Not multiple of each other");
        }
    }
}
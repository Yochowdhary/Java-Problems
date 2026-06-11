import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Year");
        x = input.nextInt();
        
        if(x%4 == 0){
            System.err.println("Year is leap year: " + x);
        }
        else {
            System.err.println("Not leap year: " + x);
        }
    }
}
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Number");
        x = input.nextInt();
        
        if(x%5 == 0 && x%3 == 0){
            System.err.println("Number is Divisble by 5 and 3: " + x);
        }
        else {
            System.err.println("Number is not Divisble by 5 and 3: " + x);
        }
    }
}
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.err.println("Enter your Age to check");
        x = input.nextInt();

        if(x>=18){
            System.err.println("Eligible");
        }
        else {
            System.err.println("Not Eligible");
        }
    }
}
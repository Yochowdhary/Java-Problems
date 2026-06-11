import java.util.Scanner;

public class q8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int x = input.nextInt();

        if(x>=100 && x<=999){
            System.out.println("Lies in the bracket");
        }
        else {
            System.out.println("Don't lies in the bracket");
        }

    }
}
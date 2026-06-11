import java.util.Scanner;

public class q5 {
    public static void main(String [] args){
        System.out.println("Enter the 1st number");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println("Enter the 2nd number");
        int y = input.nextInt();

        System.out.println("Enter the 3rd Number");
        int z = input.nextInt();

        int d;

        d = x-y;

        if(y-z == d){
            System.out.println("Yes it is Arthimatic progression");
        }
        else{
            System.out.println("Not Arithmatic progression");
        }
    }
}
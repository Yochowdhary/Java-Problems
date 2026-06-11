import java.util.Scanner;

public class q6 {
    public static void main(String [] args){
        System.out.println("Enter the 1st number");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println("Enter the 2nd number");
        int y = input.nextInt();

        System.out.println("Enter the 3rd Number");
        int z = input.nextInt();

        if(y*y == x*z){
            System.out.println("Yes geomatric progression");
        }
        else{
            System.out.println("Not geomatric progression");
        }
    }
}
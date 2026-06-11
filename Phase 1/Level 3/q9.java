import java.util.Scanner;

public class q9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st side angle");
        int x = input.nextInt();

        System.out.println("Enter the 2nd side angle");
        int y = input.nextInt();

        if((x+y)<180){
            int z = 180-(x+y);
            System.out.println("The 3rd angle is " + z);
        }
        else {
            System.out.println("Invalid angle");
        }
    }
}
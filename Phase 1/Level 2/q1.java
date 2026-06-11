import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println("Enter the 1st side");
        x = input.nextInt();

        System.out.println("Enter the 2nd side");
        y = input.nextInt();
        
        System.out.println("Enter the 3rd side");
        z = input.nextInt();
        
        if(x>0 && y>0 && z>0){
            if(x+y+z == 180){
                System.out.println("Valid Triangle: " + (x+y+z));
            }
        }
         else {
                System.out.println("Not Valid Triangle");
        }
    }
}
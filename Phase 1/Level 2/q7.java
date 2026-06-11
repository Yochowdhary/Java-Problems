import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.err.println("Enter the 1st number");
        x = input.nextInt();

        System.err.println("Enter the 2nd number");
        y = input.nextInt();
        
        if(x%2==0 && y%2==0){
            System.err.println("Both Even");
        }
        else {
            if (x%2==0){
                System.err.println(x + " Even");
            }
            else if(y%2==0){
                System.err.println(y + " Even");
            }
            else if (x%2!=0 && y%2!=0){
                System.err.println("Both Odd");
            }
        }
    }
}
import java.util.Scanner;

public class q1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the X coordinate");
        int x = input.nextInt();

        System.out.println("Enter the Y coordinate");
        int y = input.nextInt();

        if(x==0 && y==0){
            System.out.println("The coordinates are origin");
        }
        else if( x==0 && y>0){
            System.out.println("The coordinates are of Y");
        }
        else if (x>0 && y==0){
            System.out.println("The coordinates are of X");
        }
        else{
            System.out.println("The coordinates lies on both X and Y");
        }
    }
}
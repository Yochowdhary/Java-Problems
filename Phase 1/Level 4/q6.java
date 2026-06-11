import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int x = input.nextInt();

        System.out.println("Enter 2nd number ");
        int y = input.nextInt();

        if(x>=0 && y>=0){
            if(x+y<100){
                System.out.println("Both positive but less than 100");
            }
            else{
                System.out.println("Not less than 100");
            }
        }
        else {
            System.out.println("X or Y one is negative");
        }
    }
}
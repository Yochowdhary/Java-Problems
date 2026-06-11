import java.util.Scanner;

public class q7 {
    public static void main(String [] args){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int first = x/100;
        int second = (x/10)%10;
        int third = (x%10);

        if(first + third == second){
            System.out.println("Yes 1st and last sum is = middle");
        }
        else {
            System.out.println("No");
        }
    }
}
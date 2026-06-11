import java.util.Scanner;

public class q1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your character");

        char y = input.next().charAt(0);
        int x = (int)y;

        if(x>=65 && x>=90){
            System.out.println("This is a character");
        }
        else if (x<=9999999){
            System.out.println("This is a Number");
        }
        else{
            System.out.println("This is Special Character");
        }
    }
}
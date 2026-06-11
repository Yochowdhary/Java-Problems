import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an number:");
        int x = input.nextInt();

        if(x%7 == 0 || x%10 == 7){
            System.out.println(x + " Number is a multiple of 7 or ends with 7");
        }
        else {
           System.out.println("Not Valid");
        }
    }
}
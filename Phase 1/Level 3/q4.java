import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ad number:");
        int num = input.nextInt();

        if(num >=0 && num <=9){
            System.out.println("Sigle digit");
        }
        else if (num > 9 && num <= 99){
            System.out.println("Double digit");
        }
        else{
            System.out.println("Multi-Digit");
        }
            
    }

}
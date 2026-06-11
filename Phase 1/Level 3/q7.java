import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        System.out.println("Enter the currency note");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if((x%2000==0) || (x%500==0) || (x%100==0)){
            System.out.println("Amount can be evenly devided");
        }
        else {
            System.out.println("Amount can't be devide");
        }
    }
}
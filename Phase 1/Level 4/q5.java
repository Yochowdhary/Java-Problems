import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age ");
        int x = input.nextInt();

        System.out.println("Enter your Income (LPA) ");
        int y = input.nextInt();

        if(x>=18){
            if(y>=5){
                System.out.println("Eligible as Age is " + x + " and Income is " + y);
            }
            else{
                System.out.println("Not eligible");
            }
        }
    }
}
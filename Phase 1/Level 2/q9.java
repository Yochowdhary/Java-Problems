import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.err.println("Enter your Number");
        x = input.nextInt();

        if(x==1){
            System.err.println("Sunday");
        }
        else if (x==2){
            System.err.println("Monday");
        }
        else if (x==3){
            System.err.println("Tuesday");
        }
        else if (x==4){
            System.err.println("Wednesday");
        }
        else if (x==5){
            System.err.println("Thusday");
        }
        else if (x==6){
            System.err.println("Friday");
        }
        else if (x==7){
            System.err.println("Saturday");
        }
        else if (x>7 || x<0){
            System.err.println("Not valid entry");
        }
    }
}
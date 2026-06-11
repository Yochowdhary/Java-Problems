import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Number");
        x = input.nextInt();
        
        if(x>0){
            System.err.println("Number is Positive: " + x);
        }
        else if(x<0){
            System.err.println("Number is Negative: " + x);
        }
        else if(x==0){
            System.err.println("Number is Zero");
        }
    }
}
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter the Number");
        x = input.nextInt();
        
        if(x>=90 && x<=100){
            System.err.println("A grade" + x);
        }
        else if (x>=80 && x<90) {
            System.err.println("B grade " + x);
        }
        else if (x>=60 && x<80) {
            System.err.println("C grade " + x);
        }
        else if (x>40 && x<60) {
            System.err.println("D grade " + x);
        }
        else if (x<40) {
            System.err.println("F grade " + x);
        }
    }
}
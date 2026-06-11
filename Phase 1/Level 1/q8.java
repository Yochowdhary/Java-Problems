import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.err.println("Enter temperature");
        x = input.nextInt();
        
        if(x<25){
            System.err.println("Temperature is Cold: " + x);
        }
        else if (x>=25 && x<=30) {
            System.err.println("Temperature is Warm: " + x);
        }
        else if (x>30) {
            System.err.println("Temperature is Hot: " + x);
        }
    }
}
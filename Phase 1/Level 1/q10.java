import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char x;
        System.err.println("Enter Anything");
        x = input.next().charAt(0);
        int acsi = (int) x;

        if(acsi >=65 && acsi <= 90){
            System.err.println("Entered is Capital Letter: " + x);
        }
        if(acsi >= 97 && acsi <= 122){
            System.err.println("Entered is Small Letter: " + x);
        }
        if(acsi >= 0 && acsi <= 9){
            System.err.println("Entered is Small Letter: " + x);
        }
    }
}
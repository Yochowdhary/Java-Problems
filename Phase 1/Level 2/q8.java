import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char x;

        System.err.println("Enter your Char");
        x = input.next().charAt(0);

        int ascii = (int) x;

        if(ascii >= 65 && ascii<=78){
            System.err.println("Lies between A to M");
        }
        else if (ascii >=79 && ascii <= 90){
            System.err.println("Lies between N to Z");
        }
    }
}
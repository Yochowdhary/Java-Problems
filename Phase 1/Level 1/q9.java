import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char x;
        System.err.println("Enter the Albhabhet");
        x = input.next().charAt(0);
        
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            System.err.println("Entered is Vowel: " + x);
        }
        else {
            System.err.println("Entered is Consonent: " + x);
        }
    }
}
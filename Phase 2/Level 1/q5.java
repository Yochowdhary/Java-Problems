import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number for Table");
        int x  = input.nextInt();

        for(int i=1; i<11; i++){
           System.out.println((x) + " x " + i +" = " + x*i);
        }
    }
}
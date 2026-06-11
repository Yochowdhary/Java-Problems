import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial");

        int x = input.nextInt();
        int n = 1;

        for(int i=1; i<=x; i++){
            n = n*i;
        }
        System.out.println(n);
    }
}
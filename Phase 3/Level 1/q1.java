import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print ");
        int x = input.nextInt();
        rec(x,1);

    }

    public static void rec(int x, int n){
        if(x<n){
            return;
        }
        System.err.println(n);
        rec(x,n+1);
    }
}
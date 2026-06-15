import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        odd(1,x);
        
    }
    public static void odd(int n, int x){
        if(x<n){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        odd(n+1,x);
    }
}
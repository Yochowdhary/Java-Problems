import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter the number till Print");
        rec(x);
    }
    public static void rec(int x){
        if(x<0){
            return;
        }
        System.out.println(x);
        rec(x-1);
    }
}
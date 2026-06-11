import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth numbers sum you want ");

        int x = input.nextInt();
        int n =0;

        for(int i=1; i<=x; i++){
            n = n+i;
        }
        System.out.println(n);
    }
}
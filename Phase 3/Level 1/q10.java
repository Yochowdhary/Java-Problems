import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");

        int x = input.nextInt();
        sum(x);
        System.out.println(sum(x)); // Returend valued printed here.

    }

    public static int sum(int x){
        if(x==1){
            return 1;
        }
        return x + sum(x-1); // Till the number becomes 1
    }
}
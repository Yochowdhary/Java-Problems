import java.util.Scanner;

public class q6{
    static int mul = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        fac(x);

    }
    public static void fac(int x){
        if(x<1){
            System.out.print(mul);
            return;
        }
        mul *= x;
        fac(x-1);
    }
}
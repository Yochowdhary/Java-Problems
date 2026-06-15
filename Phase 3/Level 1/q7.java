import java.util.Scanner;

public class q7{
    static int n;
    static int po = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        System.out.println("Enter the power");
        n = input.nextInt();
        power(x);
    }
    public static void power(int x){
        if(n<1){
            System.out.println(po);
            return;
        }
        po *= x;
        n--;
        power(x);

    }
}
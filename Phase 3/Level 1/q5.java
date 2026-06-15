import java.util.Scanner;

public class q5{
    static int add = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        sum(1,x);
    }
    public static void sum(int n, int x){
        if(n>x){
            System.out.println(add);
            return;
        }
        add += n;
        sum(n+1,x);
    }
}
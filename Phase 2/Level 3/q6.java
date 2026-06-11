import java.util.Scanner;

public class q6{
    static int factor(int a){
        for(int i = 1; i<=a; i++){
            if(a%i==0){
               System.out.println(i+" ");
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial");

        int x = input.nextInt();
        factor(x);
    }
}
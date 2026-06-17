import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter the number ");
        int x = input.nextInt();
        
        int result = pro(x,product);
        System.out.println(result);
    }

    public static int pro(int x, int product){
        if(x<=0){
            return product;
        }
        int digit = x%10;
        product *= digit;
        x /= 10;
        return pro(x, product);
    }
}
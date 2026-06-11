import java.util.Scanner;

public class q1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");

        int x = input.nextInt();
        int i = 0;
        int digit = 0;

        while(x>0){
            digit = x%10;
            x = x/10;
            i++;            
        }
        digit--;
        
        System.out.println(i);

    }
}
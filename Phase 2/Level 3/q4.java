import java.util.Scanner;

public class q4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number");
        int x = input.nextInt();

        System.out.println("Enter the Second number");
        int y = input.nextInt();

        int largest;
        int st = 0;

        if(x>y){
            largest = x;
        }
        else{
            largest = y;
        }

        for(int i = 1; i<=largest; i++){
            if(x%i==0 && y%i==0){
                st = i;
            }
        }

        System.out.println(st + " is the HCF/GCD");
    }
}
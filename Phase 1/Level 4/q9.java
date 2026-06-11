import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the units");
        int x = input.nextInt();

        if(x>0 && x<100){
            x*=8;
        }
        else if (x>100 && x<200){
            x*=10;
        }

        System.out.println("Your bill is " + x);
    }
}
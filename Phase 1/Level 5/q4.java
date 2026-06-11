import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        System.out.println("Enter the Hours");
        Scanner input = new Scanner(System.in);

        int hr = input.nextInt();

        System.out.println("Enter the Minutes");
        int min = input.nextInt();

        int theta = 0;

        if(hr<=24 && min<=59){
            theta = (30*hr - 11/2*min);
        }

        System.out.println("The angle is " + theta);

    }
}
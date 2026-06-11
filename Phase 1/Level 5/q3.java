import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        System.out.println("Enter the Date");
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();

        System.out.println("Enter the Month");
        int month = input.nextInt();

        if(month==2 && date<=28){
            System.out.println("Date and Month is valid");
            return;
        }

        if(month == 8 && date<=31){
            System.out.println("Date and Month is Valid");
            return;
        }

        if((month+1)%2==0 && month<8){
            if(date <= 31){
                System.out.println("Date & Month is Valid");
            }
        }
        else if((month)%2==0 && month <=12 && month>=8){
            if(date <= 31){
                System.out.println("Date & Month is Valid");
            }
            else{
                System.out.println("Not Valid");
            }
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int x = input.nextInt();
        int smallest = x%10;
        int largest = x%10;

        while(x>0){
          int digit = x%10;   
          if(smallest>digit){
            smallest = digit;
          }
          if (largest<digit){
            largest = digit;
          }
          x = x/10;
        }

        System.out.print(smallest + " " + largest);
    }
}
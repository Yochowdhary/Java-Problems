import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        float x = input.nextFloat();

        if(x<24 && x>0){
            if(x<12){
                System.out.println("AM");
            }
            else{
                System.out.println("PM");
            }
        }
    }
}
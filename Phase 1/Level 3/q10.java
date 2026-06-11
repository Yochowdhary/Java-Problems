import java.util.Scanner;

public class q10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the perfect sqaure ");

        int x = input.nextInt();
        
        for(int i=1; i<20; i++){
            int y = x/i;

            if(y==i){
                System.out.println("This is the perfect square " + i);
            }
        }
    }
}
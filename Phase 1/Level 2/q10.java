import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.err.println("Enter your Month ");
        x = input.nextInt();

        if(x==2){
            System.err.println("28");
            return;
           }

        if((x+1)%2==0 && x<=7 || x==8){
           System.err.println("31");
           return;
        }
        else if ((x+1)%2==0){
            System.err.println("30");
            return;
        }

        if(x%2==0 && x>7 && x<=12){
            System.err.println("31");
        }
    }
}
import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for(int i = 1; i<=5; i++){
            int x = input.nextInt();

            if(x==0){
               i -= 1; // No use of continue satement my own logic is good
            }
            sum += x;
        }
        System.out.println(sum);
    }
}

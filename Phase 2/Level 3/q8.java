import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int x = input.nextInt();
        int org = x;
        int sum = 0;

        while(x>0){
            int digit = x%10;
            for(int i = digit-1; i>=1; i--){
                digit*=i;
            }
            sum += digit;
            x = x/10;
        }

        if(sum == org){
            System.out.println(org + " Yes it's and Strong number");
        }
        else{
            System.out.println(" Not a super number");
        }
    }
}
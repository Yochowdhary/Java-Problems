import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check Prime");

        int x = input.nextInt();
        int count = 0;
    
        for(int i = 1; i<=x; i++){
            if(x%i==0){
              count++;
            }
        }

        if(count==2){
            System.out.println(x + " is a Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}
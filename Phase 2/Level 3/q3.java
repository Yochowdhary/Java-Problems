import java.util.Scanner;

public class q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a");
        int x = input.nextInt();
        System.out.println("Enter the b");
        int y = input.nextInt();

        for(int i = x; i<=y; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}
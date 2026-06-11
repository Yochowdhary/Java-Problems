import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth Number ");

        int x = input.nextInt();

        for(int i = 1; i<=x; i++){
            System.out.println(i*i);
        }
    }
}
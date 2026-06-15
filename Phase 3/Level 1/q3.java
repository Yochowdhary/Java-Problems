import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        even(x,1);
    }
    public static void even(int n, int x){
        if(n<x){
            return;
        }
        if(x%2==0){
            System.out.println(x);
        }
        even(n,x+1);
    }
}
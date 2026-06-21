import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String x = sc.nextLine();
        int count = 0;
        for(int i = 0; i<x.length(); i++){
           count++;
        }
        System.out.println(count + " is the length of String");
    }
}
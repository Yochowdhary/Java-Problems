import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String x = sc.nextLine();

        for(int i = 0; i<x.length(); i++){
            int ascii = (int)x.charAt(i);
            System.out.print(ascii+" ");
        }
    }
}
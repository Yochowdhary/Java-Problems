import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String x = sc.nextLine();
        System.out.println(x.charAt(0) + " is the 1st Char and " + x.charAt(x.length()-1)+" is the last Char");
    }
}
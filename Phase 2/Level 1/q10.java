import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");

        int x = input.nextInt();

        int first = x/1000;
        int second = (x/100)%10;
        int third = (x/10)%10;
        int forth = x%10;

        int pro = first*second*third*forth;

        System.out.println(pro);
    }
}
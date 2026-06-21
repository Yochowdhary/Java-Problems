import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");

        String x = sc.nextLine();
        int count = 0;

        for(int i = 0; i<x.length(); i++){
            if(x.charAt(i) != ' '){
               count++;
            }
        }
        System.out.println(count+" is the total count");
    }
}
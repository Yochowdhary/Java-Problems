import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String");
        String x = sc.nextLine();

        for(int i = 0; i<x.length(); i++){
            if(x.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count+" is the length of String except blank Spaces");
    }
}
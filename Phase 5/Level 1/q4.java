
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        for(int i = 0; i<x.length(); i++){
            char ch = x.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                int convert = (int) ch;
                convert += 32;
                ch = (char) convert;
            }
            System.out.print(ch);
        }

    }
}
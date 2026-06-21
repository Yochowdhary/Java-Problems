import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");

        String x = sc.nextLine();
        int vowelcount = 0;
        int constcount = 0;

        for(int i = 0; i<x.length(); i++){
            if(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u'){
               vowelcount++;
            }
            else if (x.charAt(i) != ' '){
                constcount++;
            }
        }
        System.out.println(vowelcount+" is the vowels " + constcount + " is the consonent");
    }
}
import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String x = sc.nextLine();
        for(int i = 0; i<x.length(); i++){
            char ch = x.charAt(i); // 1st letter store krega.
            int n = (int) x.charAt(i); //Int main convert krega.
            if(ch >= 'a' && ch <= 'z'){ // Agr small letter hai to 32 minus krega.
               n -= 32;
               ch = (char) n; // Aur fir wo int ko char main convert krega.
            }
            
            System.out.print(ch+" "); //Then final output ayega.
        }
    }
}
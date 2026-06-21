import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        int count = 1;

        for(int i = 1; i<x.length()-1; i++){
            if(x.charAt(i) != ' ' && x.charAt(i-1) == ' '){ //Abhi wala blank nahi hai aur phele wala blank thaa
                count++;
            }
        }
        System.out.println(count + " is the number of words");
    }
}
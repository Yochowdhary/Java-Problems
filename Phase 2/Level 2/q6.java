import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the perfect number");
        int x = input.nextInt();
        int fac = 0;

        for(int i = 1; i<x; i++){
            if(x%i==0){
                fac += i;
            }
        }
        if(fac == x){
            System.out.println(x + " is the Perfect numbr");
        }
        else{
            System.out.println("Not perfect number");
        }
    }
}
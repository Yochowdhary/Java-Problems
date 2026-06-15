import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");

        int x = input.nextInt();

        for(int i = 1; i<= x; i++){
            int fac = 1;
            for(int n = i; n>0; n--){
                fac *= n;
            }
            System.out.println(fac);
        }
    }
}
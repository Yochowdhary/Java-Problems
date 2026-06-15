import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int x = input.nextInt();

        for(int i = 1; i <= x; i++){
            for(int n = i; n>0; n--){
                System.out.print(i);
            }

            System.out.println(" ");

        }
    }
}
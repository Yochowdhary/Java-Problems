import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the N numbers to find the sum");
        int n = input.nextInt();
        int x = 0;
        for(int i=0; i<=n; i++){
          if(i%2==0){
            x = x+i;
          }
        }
        System.out.println(x);
    }
}
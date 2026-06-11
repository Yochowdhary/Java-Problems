import java.util.Scanner;

public class q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int [] x = new int[3];

        for(int i=0; i<3; i++){
            System.out.println("Enter the " + i+1 + " Number");
            x[i] = input.nextInt();
        }

        for(int i=0; i<2; i++){
            for(int n=0; n<2; n++){

            if(x[n]>x[n+1]){
                int temp = x[n];
                x[n] = x[n+1];
                x[n+1] = temp;
            }

            }
        }

        System.out.println("The median is " + x[1]);
    }
}
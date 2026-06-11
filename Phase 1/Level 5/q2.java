import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st side");
        int x = input.nextInt();

        System.out.println("Enter the 2nd side");
        int y = input.nextInt();

        System.out.println("Enter the 3rd side");
        int z = input.nextInt();

        int a = 0;
        int b = 0;

        int largest = x;

        if(largest<y){
           largest = y;
        }
        if( largest < z){
            largest = z;
        }

        if(x!=largest && y!=largest){
            a = x*x;
            b = y*y;
        }


        if(y!=largest && z!=largest){
            a = z*z;
            b = y*y;

        }


        if(z!=largest && x!=largest){
            a = x*x;
            b = z*z;

        }

        largest = largest*largest;

        if((a+b)==largest){
            System.out.println("Yes it is Pythagoras triplet");
        }
        else{
            System.out.println("Not Pythagoras triplet");
        }
    }
}
import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st Number");

        int x = input.nextInt();

        System.out.println("Enter the 2nd Number");
        int y = input.nextInt();

        int st = 0;

        int largest;

        if(x>y){
            largest = x;
        }
        else{
            largest = y;
        }

        boolean flag = false;

        for(int i = 1; i<=largest; i++){
          if(flag!=true){
            for(int j = 1; j<=largest; j++){
                if(x*i == y*j){
                    st = x*i;
                    flag = true;
                }
            }
        }
    }
        System.out.println(st + " is the LCM");
    }
}

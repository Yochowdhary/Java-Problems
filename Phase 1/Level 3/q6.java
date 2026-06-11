import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X cordinate");
        int x = sc.nextInt();
        System.out.println("Enter Y Cordinate");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if( x<0 && y>0) {
            System.out.println("2nd Quadrant");
        }
        else if (x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if (x>0 && y<0){
            System.out.println("4th Quadrant");
        }
    }
}
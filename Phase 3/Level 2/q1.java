import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int x = input.nextInt();
        int xcount = 0;
        int result = count(x, xcount);
        System.out.println(result);
        
    }
    public static int count(int x, int xcount){
        if(x<=0){
            return xcount;
        }
        int digit = x%10;
        xcount++;
        digit++; // Just for fun added this no use here.
        x /= 10;
        return count(x, xcount); // Yahi retrun krna hoga nahi to code nahi chalega.
    }
}
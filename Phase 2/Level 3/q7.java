import java.util.Scanner;

public class q7{
    static int sum(int a){
        int add = 0;
        for(int i =1; i<=a; i++){
            if(a%i==0){
                add += i;
            }
        }
        System.out.println(add);
        return add;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of factorials");
        int x = input.nextInt();
        sum(x);
    }

}
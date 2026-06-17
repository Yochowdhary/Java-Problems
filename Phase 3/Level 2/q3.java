import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int store = 0;
        System.out.println("Enter the number ti check Palindrome");

        int x = input.nextInt();
        int org = x;
        int result = palin(x, store);
        
        if(result == org){
            System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static int palin(int x, int store){
        if(x<=0){
            return store;
        }
        int digit = x%10;
        store = store * 10 + digit;
        x /= 10;
        return palin(x,store);
    }
}
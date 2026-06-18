import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array");

        int x = sc.nextInt();
        int arr[] = new int[x];
        int y = sc.nextInt();

        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==y){
                count++;
            }
        }
        
        System.out.println("The number is repeated this many times " + count);

    }
}
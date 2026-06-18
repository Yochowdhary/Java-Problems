import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");
        int x = sc.nextInt();

        System.out.println("Enter the Value of K");
        int y = sc.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > y){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
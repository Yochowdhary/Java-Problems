import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%3 == 0 && arr[i]%7 == 0){
                count++;
            }
        }

        if(count==0){
            System.out.println("No number is Divisible by 7 and 3 Both");
        }
        else {
            System.out.println(count+ " numbers in the Array is divisible by 3 and 7 both");
        }
    }
}
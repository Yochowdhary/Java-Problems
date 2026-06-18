import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Elements");
        int evencount = 0;
        int x = sc.nextInt();
        int oddcount = 0;
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println("Count of Even are "+ evencount + " Count of Odd are " + oddcount);
    }
}
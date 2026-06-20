import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");

        int x = sc.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        for(int i = 0; i<arr.length-1; i++){
            for(int n = i+1; n<arr.length; n++){
                if(arr[i]+arr[n] == k){
                    count++;
                }
            }
        }
        System.out.println(count+" is the pair of elements sum = "+k);
    }
}
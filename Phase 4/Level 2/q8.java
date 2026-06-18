import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];
        double srt;
        int isPrime = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            srt = Math.sqrt(arr[i]); // Prime means to check the number till its square root.
            for(int n = 2; n<=srt; n++){
                if(arr[i]%n != 0){
                    isPrime++;
                }
            }
        }
        System.out.println("The Pime numbers in Array are  " + isPrime);
    }
}
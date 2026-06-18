import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];
        int perf;
        double srt;
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            srt = Math.sqrt(arr[i]);
            perf = (int)srt; // To comapre that the digits are in decimals or zero

            if(srt == perf){
                count++;
            }
        }

        System.out.println(count + " are perfect squares");
    }
}
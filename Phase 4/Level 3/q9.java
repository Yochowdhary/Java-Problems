import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");

        int x = sc.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int temp;
         
        while(i<arr.length-1){ //No need to go through last element in Array.
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i+=2;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
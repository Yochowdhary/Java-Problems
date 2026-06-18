import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int length = arr.length;
        
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[length-1];
            arr[length-1] = temp;
            length -= 1;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

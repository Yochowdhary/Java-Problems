import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");

        int x = sc.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
          arr[i] = sc.nextInt();
        }

        int maxvalue = Integer.MIN_VALUE;
        int index = 1; // As array starts from 0 then to balance it out.

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
                index = i;
            }
        }

        System.out.println("This is the index of Max value in the array "+index);
    }
}
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int x = sc.nextInt();
        
        System.out.println("Enter the target number ");
        int y = sc.nextInt();
        int found = 0;

        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == y){
               found = i;
            }
        }

        if(found != 0){
            System.out.println("The first occurance is " + found);
        }
        else {
            System.out.println("Not found in the array ");
        }
    }
}
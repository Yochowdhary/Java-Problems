import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");
        int x = sc.nextInt();

        System.out.println("Enter the Value to search ");
        int y = sc.nextInt();

        int arr[] = new int[x];
        int exists = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
           if(arr[i] == y){
             exists = arr[i];
        }
        }

        if(exists > 0){
            System.out.println("Exists "+ exists);
        }
        else{
            System.out.println("Don't Exists");
        }
}
}
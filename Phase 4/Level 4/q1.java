
import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of both Arrays");
        int samele = 0;
        boolean inOrder = false;
        int img = 0;

        int x = sc.nextInt();

        System.out.println("Enter the 1st Array");
        int arr1[] = new int[x];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd Array");
        int arr2[] = new int[x];

        for(int i = 0; i<arr1.length; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] == arr2[i]){
                inOrder = true;
                img++; // Fake to remove yellow line.
            }
            else{
                inOrder = false;
            }
            for(int n = 0; n<arr1.length; n++){
                if(arr1[i] == arr2[n]){
                    samele++;
                    break; // At time when found same element break the satatement and check from starting.
                }
            }
        }

        System.out.println("Same elements in Arrays " + samele);
        System.out.println("is Array in Order " + inOrder);
    }
}
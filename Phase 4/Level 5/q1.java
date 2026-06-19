import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrays");
        boolean acen = true;

        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter Elements of Array");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                acen = false; // Anyone time false, then code complete no need to check.
                break;
            }
        }

        if(acen == true){
            System.out.println("Acending order");
        }
        else{
            System.out.println("Not in proper order");
        }
    }
}
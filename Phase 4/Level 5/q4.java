import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of Array");

    int x = sc.nextInt();
    int arr[] = new int [x];
    int smallest = Integer.MAX_VALUE;
    int secsmall = Integer.MAX_VALUE;

    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i<arr.length; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    for(int i = 0; i<arr.length; i++){
        if(arr[i]<secsmall && arr[i] != smallest){
            secsmall = arr[i];
        }
    }

    System.out.println(secsmall + " is the 2nd Smallest");
        
    }
    
}
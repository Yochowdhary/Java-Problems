import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of Array");

    int x = sc.nextInt();
    int arr[] = new int [x];
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i<arr.length; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
        if(arr[i] > largest){
            largest = arr[i];
        }
    }

    System.out.println((largest - smallest) + " is the Difference");
        
    }
    
}
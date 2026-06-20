import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of Array");

    int x = sc.nextInt();
    int arr[] = new int [x];
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    int sum = 0;

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

        sum += arr[i];
    }

    sum = sum - largest;
    sum = sum - smallest;

    System.out.println(sum + " is the sum except smallest and largest");
        
    }
    
}
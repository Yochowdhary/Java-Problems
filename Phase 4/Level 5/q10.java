import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrray");

        int x = sc.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int n = 0; n<arr.length; n++){
                if(arr[i] == arr[n]){
                    count++;
                }
            }
            if(count==1){ //Means when started with same element it will be 1 only. 
                System.out.println(arr[i] + " is the unique element.");
            }
        }
    }
}
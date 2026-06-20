import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Arrray");

        int x = sc.nextInt();
        int arr[] = new int[x];
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            for(int n = 0; n<arr.length; n++){
                if(arr[i] == arr[n]){
                    count++;
                }
            }
            System.out.println(arr[i]+ " is "+count+ " times");
            count = 0;
        }
    }
}
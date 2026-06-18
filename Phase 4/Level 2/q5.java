import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");

        int x = sc.nextInt();

        int arr[] = new int[x];
        boolean found = false;

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;  i<arr.length; i++){
            if(found == false){
            for(int n = i+1; n<arr.length; n++){ // Used n = i+1 so that the arr[i] != arr[n] always 1 greater.
                if(arr[i] == arr[n]){
                    found = true;
                    break;
                }
            }
        }
        }

        if(found == false){
            System.out.println("The element in the Array are Unique");
        }
        else if (found == true){
            System.out.println("Are not unique");
        }

    }
}
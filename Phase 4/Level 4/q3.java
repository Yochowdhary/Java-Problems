import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st Array");

        int x = sc.nextInt();
        int arr1[] = new int[x];
        System.out.println("Enter the Elemnets of Array 1");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of 2nd Array");

        int y = sc.nextInt();
        int arr2[] = new int[y];
        System.out.println("Enter the Elemnets of Array 2");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[arr1.length + arr2.length];
        int n = 0;

        for(int i = 0; i<arr3.length; i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[n];
                n++;
            }
        }

        for(int ele : arr3){
            System.out.print(ele + " ");
        }
    }
}

//Best question till now.
import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int ncount = 0;
        int pcount = 0;
        int zcount = 0;

        int x = sc.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                ncount++;
            }
            else if(arr[i]>0){
                pcount++;
            }
            else{
                zcount++;
            }
        }

        System.out.println("+ve are " + pcount + " -ve are "+ ncount + " Zeros are " + zcount);
    }
}
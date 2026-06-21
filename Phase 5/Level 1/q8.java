import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String y = sc.nextLine();

        if(x.charAt(0) > y.charAt(0)){
            System.out.println(y+" comes first");
        }
        else{
            System.out.println(x+" comes first");
        }
    }
}
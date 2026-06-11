public class q1{
    public static void main(String[] args) {

        int digit;
        int x;

        for(int i = 1; i<101; i++){
            int sum = 0;
            x = i;

            while(x>0){
                digit = x%10;
                sum += digit;
                x = x/10;
            }

            if(sum%2==0){
                System.out.println(i+ " ");
            }
        }
    }
}
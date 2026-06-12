public class q4{
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++){
            int sum = 0;
            int x = i;

            while(x>0){
            int digit = x%10;
            sum += digit;
            x = x/10;
        }
        if(sum%3==0){
            System.out.println(i);
        }
    }
       
    }
}
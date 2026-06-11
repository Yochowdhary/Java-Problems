public class q3{
    public static void main(String[] args) {
        for(int i = 1; i<=500; i++){
            int x = i;
            int rev = 0;

            while(x>0){
            int data = x%10;
            rev = rev * 10 + data;
            x = x/10;
        }

        if(i == rev){
            System.out.println(rev);
        }
    }
    
    }
}
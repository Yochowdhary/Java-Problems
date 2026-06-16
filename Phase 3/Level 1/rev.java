public class rev{
    public static void main(String[] args) {
        int x = 83932;
        reverse(x);
    }
    public static void reverse(int x){
        if(x>0){
        int digit = x%10;
        System.out.print(digit);
        x = x/10;
        reverse(x);
        }
    }
}
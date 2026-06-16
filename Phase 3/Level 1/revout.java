public class revout{
    static int re = 0;
    static int digit = 0;
    public static void main(String[] args) {
        int x = 930221;
        rev(x);
        System.out.println(re);
    }
    public static int rev(int x){
        if(x>0){
        digit = x%10;
        re = re * 10 + digit;
        x /= 10;
        rev(x);
        }
        return re;
    }
}
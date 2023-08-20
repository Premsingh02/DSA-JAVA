package August20;

public class MagixNumber {
    public static boolean findMagicNumber(int n){
        int i = 5;
        while(n>=i){
            if(n % i == 0 && n / i % 5 == 1){
                return true;
            }
            i*=5;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 125;
        boolean result = findMagicNumber(n);
        System.out.println(result);
    }
}

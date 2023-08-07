package August07;

public class ThreeDivisors {
    public static boolean isThree(int n) {
        int count = 0;
        for(int i =1; i*i<=n; i++){
            if(n%i==0){
                count+=2;
            }
            if(i*i==n) count--;
        }
        if(count==3){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isThree(n));
    }
}

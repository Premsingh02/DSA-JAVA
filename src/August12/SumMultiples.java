package August12;

public class SumMultiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 || i % 5 ==0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 7;
        int result = sumOfMultiples(n);
        System.out.println("The sum of all the multiples are: " + result);
    }
}

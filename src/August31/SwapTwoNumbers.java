package August31;
import java.util.*;
public class SwapTwoNumbers {
    public static List<Integer> swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return Arrays.asList(a, b);
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;
        System.out.println(swapNumbers(num1,num2));
    }
}

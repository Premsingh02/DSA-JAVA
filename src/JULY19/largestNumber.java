package JULY19;

public class largestNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        int largestNumber = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largestNumber<arr[i]){
                largestNumber = arr[i];
            }
        }

        System.out.println(largestNumber);
    }
}

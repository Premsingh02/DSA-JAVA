package August06;

public class ArrayReverse {
    public static void reverse(int arr[]){
        int first =0, last = arr.length-1;
        while(first < last){
            //
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,11};

        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

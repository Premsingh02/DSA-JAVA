package August11;

public class FindthePivotInteger {
    public int pivotInteger(int n) {
        int rightSum = 0;
        int leftSum = 0;

        for(int i =1; i<=n; i++){
            rightSum+=i;
        }

        for(int i=1; i<=n; i++){
            rightSum-=i;
            if(rightSum==leftSum){
                return i;
            }
            leftSum+=i;
        }
        return -1;
    }
}

import java.util.*;

public class Tut16MaxSubArraySum {
    static int max_subarr_sum(int arr[])

    {
        int sum=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum<0){
                sum=0;

            }
            ms=Math.max(ms,sum);
        }
        return ms;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=max_subarr_sum(nums);
        System.out.println(maxSum);

    }
}
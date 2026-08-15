import java.util.Arrays;

public class Tut19TwoSum {

    static int[] twoSum(int arr[], int sum) {

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int currS = arr[l] + arr[r];

            if (currS < sum) {
                l++;
            } 
            else if (currS > sum) {
                r--;
            } 
            else {
                return new int[]{arr[l], arr[r]};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int arr[] = {238, 327, 34, 5, 7};

        int[] res = twoSum(arr, 332);

        System.out.println(Arrays.toString(res));
    }
}
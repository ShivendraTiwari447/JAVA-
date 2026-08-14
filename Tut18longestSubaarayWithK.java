public class Tut18longestSubaarayWithK {

    static int longest_subarray_with_sum_k(int arr[], int k) {

        int max_length = 0;

        for (int s = 0; s < arr.length; s++) {

            for (int e = s; e < arr.length; e++) {

                int currS = 0;

                for (int i = s; i <= e; i++) {
                    currS += arr[i];
                }

                if (currS == k) {
                    max_length = Math.max(max_length, e - s + 1);
                }
            }
        }

        return max_length;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int res = longest_subarray_with_sum_k(arr, 6);

        System.out.println(res);
    }
}
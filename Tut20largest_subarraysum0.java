import java.util.HashMap;

public class Tut20largest_subarraysum0 {

    static int maxLen(int arr[]) {

        int sum = 0;
        int max = 0;

        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Case 1: Subarray starts from index 0
            if (sum == 0) {
                max = i + 1;
            }

            // Case 2: Same prefix sum already exists
            else if (h1.containsKey(sum)) {

                max = Math.max(max, i - h1.get(sum));

            }

            // First occurrence of prefix sum
            else {
                h1.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {9, -3, 3, -1, 6, -5};

        System.out.println(maxLen(arr));
    }
}
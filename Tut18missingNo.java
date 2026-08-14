public class Tut18missingNo {

    static int find_missing(int arr[]) {

        int max_no = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_no) {
                max_no = arr[i];
            }
        }

        int n = max_no;

        int total_sum = n * (n + 1) / 2;

        int arr_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }

        return total_sum - arr_sum;
    }

    

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};

        System.out.println(find_missing(arr));
    }
}
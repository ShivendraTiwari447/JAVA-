public class Tut27_rec_subset {

    static int subsetK(int arr[], int index, int sum, int k, int count) {

        if (index == arr.length) {

            if (count > 0 && sum == k) {
                return 1;
            }

            return 0;
        }

        // Include
        int include = subsetK(
            arr,
            index + 1,
            sum + arr[index],
            k,
            count + 1
        );

        // Exclude
        int exclude = subsetK(
            arr,
            index + 1,
            sum,
            k,
            count
        );

        return include + exclude;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 2, 34, 5, 4};

        int ans = subsetK(arr, 0, 0, 8, 0);

        System.out.println(ans);
    }
}
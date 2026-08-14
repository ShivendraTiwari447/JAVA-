public class Tut18Unionofsorted {

    static void union(int arr[], int arrr[]) {

        int i = 0;
        int j = 0;
        int k = 0;

        int n = arr.length + arrr.length;
        int union[] = new int[n];

        while (i < arr.length && j < arrr.length) {

            if (arr[i] < arrr[j]) {
                union[k] = arr[i];
                i++;
                k++;
            }

            else if (arr[i] > arrr[j]) {
                union[k] = arrr[j];
                j++;
                k++;
            }

            else {
                union[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }

        // arr ke remaining elements
        while (i < arr.length) {
            union[k] = arr[i];
            i++;
            k++;
        }

        // arrr ke remaining elements
        while (j < arrr.length) {
            union[k] = arrr[j];
            j++;
            k++;
        }

        for (int x = 0; x < k; x++) {
            System.out.print(union[x] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6, 8};
        int arrr[] = {2, 3, 5};

        union(arr, arrr);
    }
}
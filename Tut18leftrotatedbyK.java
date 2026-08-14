public class Tut18leftrotatedbyK {

    static void rotated(int arr[], int k) {

        int n = arr.length - 1;

        // Agar k array length se bada hai
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n);
        reverse(arr, 0, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int arr[], int si, int ei) {

        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        rotated(arr, 3);
    }
}
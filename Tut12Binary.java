public class Tut12Binary {

    static int search(int arr[], int target) {
        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 6, 44};

        int b = search(a, 449);
        System.out.println(b);
    }
}
public class Tut17Duplicate {
    static void duplicate(int arr[]) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for(int k=0;k<=i;k++)
        {
            System.out.println(arr[k]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5, 5 };
      duplicate(arr);
     
    }
}

import java.util.HashMap;

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

    static int prefixS(int arr[],int k)
    {
        int preS=0;
        int count=0;
        HashMap<Integer,Integer> h1 =new HashMap<>();
        h1.put(0, 1);



        
        for(int i=0;i<arr.length;i++){

            preS+=arr[i];
            if(h1.containsKey(preS-k)){
                count+=h1.get(preS-k);

            }
            h1.put(preS, h1.getOrDefault(preS, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int res = longest_subarray_with_sum_k(arr, 6);

        System.out.println(res);
    }
}
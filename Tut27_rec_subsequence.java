// public class Tut27_rec_subsequence {

//     static boolean isSubsequence(
//             int nums[],
//             int index,
//             int sum,
//             int k,
//             int count) {

//         // Base case
//         if (index == nums.length) {
//             return count > 0 && sum == k;
//         }

//         // Include
//         boolean include = isSubsequence(
//                 nums,
//                 index + 1,
//                 sum + nums[index],
//                 k,
//                 count + 1
//         );

//         if (include) {
//             return true;
//         }

//         // Exclude
//         boolean exclude = isSubsequence(
//                 nums,
//                 index + 1,
//                 sum,
//                 k,
//                 count
//         );

//         return exclude;
//     }

//     public static void main(String[] args) {

//         int nums[] = {1, 2, 3};
//         int k = 5;

//         boolean ans = isSubsequence(nums, 0, 0, k, 0);

//         System.out.println(ans);
//     }
// }







import java.util.ArrayList;

public class Tut27_rec_subsequence {

    static void printSubsequences(
            int nums[],
            int index,
            int sum,
            int k,
            ArrayList<Integer> curr) {

        // Base case
        if (index == nums.length) {

            if (!curr.isEmpty() && sum == k) {
                System.out.println(curr);
            }

            return;
        }

        // Include current element
        curr.add(nums[index]);

        printSubsequences(
                nums,
                index + 1,
                sum + nums[index],
                k,
                curr
        );

        // Backtrack
        curr.remove(curr.size() - 1);

        // Exclude current element
        printSubsequences(
                nums,
                index + 1,
                sum,
                k,
                curr
        );
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3};
        int k = 5;

        printSubsequences(
                nums,
                0,
                0,
                k,
                new ArrayList<>()
        );
    }
}
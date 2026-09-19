public class Tut27_rec_subsequence {

    static boolean isSubsequence(
            int nums[],
            int index,
            int sum,
            int k,
            int count) {

        // Base case
        if (index == nums.length) {
            return count > 0 && sum == k;
        }

        // Include
        boolean include = isSubsequence(
                nums,
                index + 1,
                sum + nums[index],
                k,
                count + 1
        );

        if (include) {
            return true;
        }

        // Exclude
        boolean exclude = isSubsequence(
                nums,
                index + 1,
                sum,
                k,
                count
        );

        return exclude;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3};
        int k = 5;

        boolean ans = isSubsequence(nums, 0, 0, k, 0);

        System.out.println(ans);
    }
}
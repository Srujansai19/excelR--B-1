class Solution5 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }
}
class LTCode005 {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("indices are: ");
        System.out.println(result[0] + " , " + result[1]);

    }
}
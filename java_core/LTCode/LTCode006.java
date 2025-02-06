class Solution6{
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int x : nums) {
            if((k==0) ||(x !=nums[k-1])) {
                nums[k] = x;
                k++;
            }
        }
        return k;
    }
}


public class LTCode006 {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int[] nums = {1,1,2};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
    
}

import java.util.Arrays;


class Solution9 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        Arrays.sort(merged);

        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
} 
    
    public class LTCode009 {
        public static void main(String[] args) {
            Solution9 solution = new Solution9();
            int[] nums1 = {1, 3};
            int[] nums2 = {2, 4};
            double result = solution.findMedianSortedArrays(nums1, nums2);
            System.out.println("Median: " + result);
        }
}

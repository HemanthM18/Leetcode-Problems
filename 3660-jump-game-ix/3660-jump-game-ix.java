class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] prefix_Max = new int[n];
        int[] ans = new int[n];
        
        prefix_Max[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix_Max[i] = Math.max(prefix_Max[i - 1], nums[i]);
        }

        int suffix_Min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (prefix_Max[i] > suffix_Min) {
                ans[i] = ans[i + 1];
            } else {
                ans[i] = prefix_Max[i];
            }
            suffix_Min = Math.min(suffix_Min, nums[i]);
        }
        return ans;
    }
}
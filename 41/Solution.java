class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Check if 1 exists
        boolean contains = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                contains = true;
                break;
            }
        }

        if (!contains) {
            return 1;
        }

        // Replace invalid values with 1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        // Mark numbers that exist
        for (int i = 0; i < n; i++) {

            int a = Math.abs(nums[i]);

            if (a == n) {
                nums[0] = -Math.abs(nums[0]);
            } else {
                nums[a] = -Math.abs(nums[a]);
            }
        }

        // Find first positive index
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }

        // Check if n exists
        if (nums[0] > 0) {
            return n;
        }

        return n + 1;
    }
}
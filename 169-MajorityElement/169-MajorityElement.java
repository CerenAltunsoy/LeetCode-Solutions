// Last updated: 6/15/2026, 7:17:38 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        
    }
}
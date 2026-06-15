// Last updated: 6/15/2026, 7:17:41 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr;
        int count = 0;
        int k=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                count++;
            }
            
        }

        /*for(int i=0; i<num; ++i){
            arr[i]==nums[i];
        }*/

    return count;
    }
}
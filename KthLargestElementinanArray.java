class Solution {
    public int findKthLargest(int[] nums, int k) {
        int temp = 0;
        for(int i = 0;i < nums.length;i++) {
            for(int j = nums.length -1; j > i; j--) {
                if(nums[j] > nums[j-1]) {
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(i == k -1){
                break;
            }
        }
        return nums[k -1];
    }
}
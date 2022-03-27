class Solution {
    public int removeElement(int[] nums, int val) {
        // nums = Arrays.stream(nums).filter(num -> num != val).toArray();
        // return nums.length;
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
    }
}
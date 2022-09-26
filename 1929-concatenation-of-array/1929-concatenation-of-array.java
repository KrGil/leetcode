class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length * 2];
        int j = 0;
        for(int i = 0; i < result.length; i++){
            j = i;
            if(i > (length - 1)){
                j = i - (length);
            }
            result[i] = nums[j];
        }
        return result;
    }
}
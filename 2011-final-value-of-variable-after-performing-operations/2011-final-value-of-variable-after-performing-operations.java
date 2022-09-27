class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            char test[] = operations[i].toCharArray();
            Arrays.sort(test);
            if(test[0] =='-'){
                result--;
            }else {
                result++;
            }
        }
        return result;
    }
}
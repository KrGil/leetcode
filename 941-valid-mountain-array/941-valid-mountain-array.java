class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int max = Arrays.stream(arr).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] == max) {
                maxIndex = i;
                if( maxIndex == arr.length-1 || maxIndex == 0) return false;
                break;
            }
        }
        for (int i = maxIndex; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        for (int i = maxIndex; i < arr.length-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
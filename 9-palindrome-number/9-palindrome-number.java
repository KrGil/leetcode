class Solution {
    public boolean isPalindrome(int x) {
         
        int lastDigit = 0;
        int tmp = x;
        int reversedNum = 0;
        while (tmp != 0) {
            lastDigit = tmp % 10;
            tmp = tmp / 10;
            reversedNum = (reversedNum * 10) + lastDigit;
        }
        System.out.println("reversedNum = " + reversedNum);
        return reversedNum==x && x >= 0?true:false;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs.length == 1) {
                return strs[0].toString();
            }  
        // String 따로 빼기
        // 따로 뺀 String 첫글자 빼기
        HashMap<String, String> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        // 가장 작은 글자 수 찾기
        int strLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int cur = strs[i].length();
            strLength = Math.min(cur, strLength);
        }
        if (strLength == 0) {
            return "";
        }

        for (int j = 0; j < strLength; j++) {
            char[] tempChar = new char[strs.length];
            // 배열에 글자 담기.
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                char[] temp= str.toCharArray();
                // 한 글자씩 배열에 담기.
                tempChar[i] = temp[j];
            }
            // 한글자씩 비교
            boolean isSame = false;
            for (int i = 1; i < tempChar.length; i++) {
                if (tempChar[i] == tempChar[i - 1]) {
                    isSame = true;
                } else {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                sb.append(tempChar[0]);
            }else{
                break;
            }
        }
        return sb.toString();  
    }
}
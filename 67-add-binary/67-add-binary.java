class Solution {
    public String addBinary(String a, String b) {
        

        // a + b = 10;
        // if x + y = 2 ---> 10

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        StringBuffer longSb = new StringBuffer();
        StringBuffer shortSb = new StringBuffer();
        if (aArray.length >= bArray.length) {
            for (char c : aArray) {
                longSb.append(c);
            }
            for (char c : bArray) {
                shortSb.append(c);
            }
        } else {
            for (char c : aArray) {
                shortSb.append(c);
            }
            for (char c : bArray) {
                longSb.append(c);
            }
        }
        // 항상 1의 자리가 index = 0
        longSb = longSb.reverse();
        shortSb = shortSb.reverse();

        // for문 길이 구하기
        String[] result = new String[longSb.length()+1];
        for (String s : result) {
            s = "";
        }

        int temp = 0;
        String first = "";
        String second = "";
        for (int i = 0; i < longSb.length(); i++) {
            first = String.valueOf(longSb.charAt(i));
            if (i >= shortSb.length()) {
                second = "";
            }else {
                first = String.valueOf(longSb.charAt(i));
                second =  String.valueOf(shortSb.charAt(i));
            }

            // sum == 111/
            if (temp == 1) {
                if ("".equals(second)) {
                    if("11".equals(first + String.valueOf(temp))){
                        result[i] = String.valueOf(0);
                        result[i + 1] = "1";
                        temp = 1;
                    }else{
                        result[i] = String.valueOf(1);
                        temp = 0;
                    }
                } else {
                    // temp == 1, second == "something"
                    if ("11".equals(first + second)) {
                        temp = 1;
                        result[i] = String.valueOf(1);
                        result[i + 1] = "1";
                    }else if ("00".equals(first + second)){
                        result[i] = String.valueOf(1);
                        temp = 0;
                    } else {
                        result[i] = String.valueOf(0);
                        temp = 1;
                    }
                }
            }else{
                if("".equals(second)){
                     if("1".equals(first)){
                         result[i] = String.valueOf(1);
                     }else{
                         result[i] = String.valueOf(0);
                     }
                }else{
                    // sum == 11
                    if ("11".equals(first + second)) {
                        result[i+1] = "1";
                        result[i] = String.valueOf(0);
                        temp = 1;
                    } else if ("00".equals(first + second)){
                        result[i] = String.valueOf(0);
                        temp = 0;
                    } else {
                        // sum == 10
                        result[i] = String.valueOf(1);
                        temp = 0;
                    }
                }
            }
        }
            
        String res = "";
        for (int i = result.length-1; i >= 0 ; i--) {
            if(result[i] != null){
                res += result[i];
            }
        }
        return res;
    }
}
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> strArray = new ArrayList<>();
        //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        //answer[i] == "Fizz" if i is divisible by 3.
        //answer[i] == "Buzz" if i is divisible by 5.
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                strArray.add("FizzBuzz");
            }else if (i % 3 == 0){
                strArray.add("Fizz");
            }else if (i % 5 == 0){
                strArray.add("Buzz");
            }else{
                strArray.add(String.valueOf(i));
            }
        }
        return strArray;
    }
}
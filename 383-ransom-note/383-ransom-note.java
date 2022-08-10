class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] temp = new int[26];
        for(char c : magazine.toCharArray()){
            temp[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            System.out.println(temp[c - 'a']);
            if(--temp[c - 'a'] < 0){
                return false;
            }
            System.out.println(temp[c - 'a']);
        }
        
        return true;
    }
}
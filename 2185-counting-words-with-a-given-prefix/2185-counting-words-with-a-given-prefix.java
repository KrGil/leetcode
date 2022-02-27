class Solution {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words).filter(v -> v.startsWith(pref)).count();
    }
}
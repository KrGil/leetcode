class Solution {
    public int maximumWealth(int[][] accounts) {
        return List.of(accounts).stream()
            .map(e -> Arrays.stream(e).sum())
            .map(e -> e.intValue())
            .collect(Collectors.toList())
            .stream()
            .max((o1, o2) -> o1.compareTo(o2))
            .orElseThrow(() -> new IllegalArgumentException(""));
    }
}
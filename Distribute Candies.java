class Solution {
    public int distributeCandies(int[] candyType) {
        return Math.min(candyType.length / 2, Arrays.stream(candyType).boxed().collect(Collectors.toSet()).size());
    }
}
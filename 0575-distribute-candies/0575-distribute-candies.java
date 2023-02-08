class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uniqueCandies = 1;
        for (int i = 1; i < candyType.length && uniqueCandies < candyType.length / 2; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueCandies++;
            }
        }
        return Math.min(uniqueCandies, candyType.length / 2);
    }
}
class Solution {
    int res = Integer.MAX_VALUE;
    private void dfs(int[] coins, int i, int amount, int count) {
        if(i < 0) return;
        if(amount % coins[i] == 0) {
            res = Math.min(res, count + amount / coins[i]);
            return;
        }
        for(int c = amount / coins[i]; c >= 0 && count + c + 1 < res; c--) {
            dfs(coins, i - 1, amount - c * coins[i], count + c);
        }
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        dfs(coins, coins.length - 1, amount, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
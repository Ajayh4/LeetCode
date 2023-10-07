class Solution {
    public int maxProfit(int[] prices) {
        int ans=0,v=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>v)
            {
                ans+=prices[i]-v;
                v=prices[i];
            }
            else
            v=prices[i];
        }
        return ans;
    }
}
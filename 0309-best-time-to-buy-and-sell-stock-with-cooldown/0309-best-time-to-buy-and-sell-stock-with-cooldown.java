class Solution {
    static int rec(int ind,int prices[],int h,int dp[][])
    {
        if(ind>=prices.length)
        return 0;
        if(dp[ind][h]!=-1)
        return dp[ind][h];
        int ans=0;
        if(h==0)
        ans=Math.max(rec(ind+1,prices,1,dp)-prices[ind],rec(ind+1,prices,h,dp));
        else
        ans=Math.max(rec(ind+2,prices,0,dp)+prices[ind],rec(ind+1,prices,h,dp));
        return dp[ind][h]=ans;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int i[]: dp)
        Arrays.fill(i,-1);
        return rec(0,prices,0,dp);
    }
}
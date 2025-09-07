class Solution {
    static int rec(int ind,int prices[],int k,int h,int dp[][][])
    {
        if(ind>=prices.length || k<=0)
        return 0;
        if(dp[ind][k][h]!=-1)
            return dp[ind][k][h];
        int ans=0;
        if(h==0)
        {
            ans=Math.max(ans,rec(ind+1,prices,k,1,dp)-prices[ind]);
            ans=Math.max(ans,rec(ind+1,prices,k,h,dp));
        }
        else
        {
            ans=Math.max(ans,rec(ind+1,prices,k-1,0,dp)+prices[ind]);
            ans=Math.max(ans,rec(ind+1,prices,k,h,dp));
        }
        return dp[ind][k][h]=ans; 
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n][k+1][2];
        for(int i[][]: dp)
        {
            for(int j[]: i)
            Arrays.fill(j,-1);
        }
        return rec(0,prices,k,0,dp);
    }
}
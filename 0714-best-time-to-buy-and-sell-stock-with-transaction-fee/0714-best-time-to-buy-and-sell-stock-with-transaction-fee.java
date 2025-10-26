class Solution {
    static int rec(int ind,int prices[],int fee,int s,int dp[][])
    {
        if(ind>=prices.length)
        return 0;
        if(dp[ind][s]!=-1)
        return dp[ind][s];
        int ans=0;
        if(s==0)
        {
            ans=Math.max(ans,(-prices[ind]+rec(ind+1,prices,fee,(s^1),dp)));
        }
        else
        {
            ans=Math.max(ans,(prices[ind]-fee+rec(ind+1,prices,fee,(s^1),dp)));
        }
        ans=Math.max(ans,rec(ind+1,prices,fee,s,dp));
        return dp[ind][s]=ans;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int i[]: dp)
        Arrays.fill(i,-1);
        return rec(0,prices,fee,0,dp);
    }
}
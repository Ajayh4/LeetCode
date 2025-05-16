class Solution {
    static int rec(int ind,int prices[],int aval,int cnt,int dp[][][])
    {
        if(cnt==2)
        return 0;
        if(ind>=prices.length)
        return 0;
        if(dp[ind][aval][cnt]!=-1)return dp[ind][aval][cnt];
        int ans=0;
        if(aval==1)
        {
            ans=Math.max(-prices[ind]+rec(ind+1,prices,0,cnt,dp),rec(ind+1,prices,aval,cnt,dp));
        }
        else
        {
            // if(prices[ind]>b)
            ans=Math.max(ans,prices[ind]+rec(ind+1,prices,1,cnt+1,dp));
            // else
            ans=Math.max(ans,rec(ind+1,prices,aval,cnt,dp));
        }
        dp[ind][aval][cnt]=ans;
        return ans;
    }
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length+1][2][3];
        for(int i[][]: dp){
            for(int j[]: i)
            Arrays.fill(j,-1);
        }
        return rec(0,prices,1,0,dp);
    }
}
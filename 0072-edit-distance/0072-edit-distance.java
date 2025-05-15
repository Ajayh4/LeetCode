class Solution {
    static int rec(int i,int j,String w1, String w2,int dp[][])
    {
        if(i>=w1.length())
        return w2.length()-j;
        if(j>=w2.length())
        return w1.length()-i;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=Integer.MAX_VALUE;
        if(w1.charAt(i)==w2.charAt(j))
        ans=Math.min(ans,rec(i+1,j+1,w1,w2,dp));
        else
        ans=Math.min(ans,1+Math.min(rec(i+1,j+1,w1,w2,dp),Math.min(rec(i+1,j,w1,w2,dp),rec(i,j+1,w1,w2,dp))));
        return dp[i][j]=ans;
    }
    public int minDistance(String w1, String w2) {
        int dp[][]=new int[w1.length()+1][w2.length()+1];
        for(int i[]: dp)Arrays.fill(i,-1);
        return rec(0,0,w1,w2,dp);
    }
}
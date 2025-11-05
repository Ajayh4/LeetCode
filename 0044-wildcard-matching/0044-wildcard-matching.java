class Solution {
    static boolean allstars(String s,int i)
    {
        for(int k=i;k<s.length();k++)
        {
            if(s.charAt(k)!='*')
            return false;
        }
        return true;
    }
    static boolean rec(int i,int j,String s,String p,int dp[][])
    {
        if(j>=p.length() && i>=s.length())
            return true;
        if(i>=s.length())
            return allstars(p,j);
        if(j>=p.length())
            return false;
        // System.out.println(i+" "+j);
        if(dp[i][j]!=-1)
        return (dp[i][j]==1);
        boolean ans=false;
        if(p.charAt(j)=='?')
        ans|=rec(i+1,j+1,s,p,dp);
        else if(p.charAt(j)=='*')
        {
            ans|=(rec(i+1,j,s,p,dp) | rec(i,j+1,s,p,dp));
        }
        else
        {
            if(s.charAt(i)==p.charAt(j))
            ans|=rec(i+1,j+1,s,p,dp);
            else{
                dp[i][j]=0;
            return false;
            }
        }
        if(ans)
        dp[i][j]=1;
        else
        dp[i][j]=0;
        return ans;
    }
    public boolean isMatch(String s, String p) {
        int dp[][]=new int[s.length()][p.length()];
        for(int i[]: dp)
        Arrays.fill(i,-1);
        return rec(0,0,s,p,dp);
    }
}
class Solution {
    static boolean rec(int pj,int i,int stones[],int n,HashMap<Integer,Integer> hm,int dp[][])
    {
        if(i>=(n-1))
        {
            if(i==(n-1))
            return true;
            return false; 
        }
        else
        {
            if(dp[i][pj]!=-1)
            return dp[i][pj]==1;
            int a=pj-1;
            int b=pj;
            int c=pj+1;
            boolean ans=false;
            if((a>0 && hm.containsKey(a+stones[i]) && rec(a,hm.get(stones[i]),stones,n,hm,dp)) || (b>0 && hm.containsKey(b+stones[i]) && rec(b,hm.get(b+stones[i]),stones,n,hm,dp)) || (c>0 && hm.containsKey(c+stones[i]) && rec(c,hm.get(c+stones[i]),stones,n,hm,dp)))
            ans=true;
            if(ans)
            dp[i][pj]=1;
            else
            dp[i][pj]=0;
            return dp[i][pj]==1;
        }
    }
    public boolean canCross(int[] stones) {
        int dp[][]=new int[stones.length+1][2*stones.length+1];
        for(int i=0;i<stones.length+1;i++)
        {
            for(int j=0;j<2*stones.length+1;j++)
            dp[i][j]=-1;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length;i++)
        hm.put(stones[i],i);
        return rec(0,stones[0],stones,stones.length,hm,dp);
    }
}
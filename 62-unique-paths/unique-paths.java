class Pair
{
    int x,y;
    Pair(int a,int b)
    {
        x=a;
        y=b;
    }
}
class Solution {
    int rec(int i,int j,int m,int n,int v[][],int dp[][])
    {
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(i==(m-1) && j==(n-1))
        return 1;
        else
        {
            v[i][j]=1;
            int dx[]={1,0};
            int dy[]={0,1};
            int ans=0;
            for(int k=0;k<2;k++)
            {
                int a=dx[k]+i;
                int b=dy[k]+j;
                if(a>=0 && a<m && b>=0 && b<n && v[a][b]==0)
                ans+=rec(a,b,m,n,v,dp); 
            }
            v[i][j]=0;
            dp[i][j]=ans;
            return ans;
        }

    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i[]: dp)Arrays.fill(i,-1);
        int v[][]=new int[m][n];
        return rec(0,0,m,n,v,dp);
    }
}
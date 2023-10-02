class Solution {
    static int rec(int s,int i,int j,int r,int c,int grid[][],int dp[][])
    {
        if(i<0 || i>=r || j<0 || j>=c)
        return 646494;
        if(i==(r-1) && j==(c-1))
        return grid[i][j];
        else
        {
            if(dp[i][j]!=-1)
            return dp[i][j];
            return dp[i][j]=Math.min(grid[i][j]+rec(s,i+1,j,r,c,grid,dp),grid[i][j]+rec(s,i,j+1,r,c,grid,dp));
        }
    }
    public int minPathSum(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int dp[][]=new int[r+1][c+1];
        for(int i[]: dp)
        Arrays.fill(i,-1);
        return rec(0,0,0,r,c,grid,dp);
    }
}
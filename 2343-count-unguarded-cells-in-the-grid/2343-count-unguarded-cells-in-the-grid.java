class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int mat[][]=new int[m][n];
        for(int i[]: guards)
        mat[i[0]][i[1]]=1;
        for(int i[]: walls)
        mat[i[0]][i[1]]=-1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                // System.out.println(i+" "+j);
                if(mat[i][j]==1)
                {
                    int tx=i,ty=j-1;
                    while(ty>=0 && mat[tx][ty]!=-1 && mat[tx][ty]!=1)
                    {
                        mat[tx][ty]=2;
                        ty-=1;
                    }
                    tx=i;ty=j+1;
                    while(ty<n && mat[tx][ty]!=-1 && mat[tx][ty]!=1)
                    {
                        mat[tx][ty]=2;
                        ty+=1;
                    }
                    j=ty-1;
                    // break;
                }
            }
        }
        // System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                // System.out.println(i+" "+j);
                if(mat[j][i]==1)
                {
                    int tx=j-1,ty=i;
                    while(tx>=0 && mat[tx][ty]!=-1 && mat[tx][ty]!=1)
                    {
                        mat[tx][ty]=2;
                        tx-=1;
                    }
                    tx=j+1;ty=i;
                    while(tx<m && mat[tx][ty]!=-1 && mat[tx][ty]!=1)
                    {
                        mat[tx][ty]=2;
                        tx+=1;
                    }
                    j=tx-1;
                    // break;
                }
            }
        }
        int ans=0;
        for(int i[]: mat)
        {
            for(int j: i)
            {
                if(j==0)
                ans+=1;
            }
        }
        return ans;
    }
}
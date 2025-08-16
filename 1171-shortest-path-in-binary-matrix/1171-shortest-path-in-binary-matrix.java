class Pair
{
    int x,y,d;
    Pair(int x,int y,int d)
    {
        this.x=x;
        this.y=y;
        this.d=d;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int sp[][]=new int[n][n];
        for(int i[]: sp)
        Arrays.fill(i,-1);
        Queue<Pair> q=new LinkedList<>();
        if(grid[0][0]==1 || grid[n-1][n-1]==1)return -1;
        q.add(new Pair(0,0,1));
        while(!q.isEmpty())
        {
            Pair t=q.poll();
            int dx[]={-1,0,1,0,-1,-1,1,1};
            int dy[]={0,1,0,-1,-1,1,-1,1};
            if(t.x==(n-1) && t.y==(n-1))
            return t.d;
            for(int i=0;i<8;i++)
            {
                int nx=dx[i]+t.x,ny=dy[i]+t.y;
                if(nx>=0 && nx<n && ny>=0 && ny<n && grid[nx][ny]==0 && (sp[nx][ny]==-1 || sp[nx][ny]>(t.d+1)))
                {
                    q.add(new Pair(nx,ny,t.d+1));
                    sp[nx][ny]=t.d+1;
                }
            }
        }
        return -1;
    }
}
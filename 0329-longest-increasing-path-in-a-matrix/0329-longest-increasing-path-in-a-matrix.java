class Pair
{
    int x,y,cnt;
    Pair(int x,int y,int cnt)
    {
        this.x=x;
        this.y=y;
        this.cnt=cnt;
    }
}
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> {
            if(a.cnt!=b.cnt)
            return b.cnt-a.cnt;
            return matrix[a.x][a.y]-matrix[b.x][b.y];
        });
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                pq.add(new Pair(i,j,1));
            }
        }
        int lp[][]=new int[r][c];
        int ml=1;
        while(!pq.isEmpty())
        {
            Pair t=pq.poll();
            // System.out.println(t.x+" "+t.y+" "+t.cnt);
            ml=Math.max(ml,t.cnt);
            ml=Math.max(t.cnt,ml);
            int dx[]={-1,0,1,0};
            int dy[]={0,1,0,-1};
            for(int i=0;i<4;i++)
            {
                int nx=dx[i]+t.x;
                int ny=dy[i]+t.y;
                if(nx>=0 && nx<r && ny>=0 && ny<c && matrix[nx][ny]>matrix[t.x][t.y] && lp[nx][ny]<t.cnt+1){
                pq.add(new Pair(nx,ny,t.cnt+1));
                lp[nx][ny]=t.cnt+1;
                }
            }
        }
        return ml;
    }
}
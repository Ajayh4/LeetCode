class Pair
{
    int x,y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int v[][]=new int[n][n];
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        int cmp=-1;
        boolean flag=false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(v[i][j]==0 && grid[i][j]==1)
                {
                    flag=true;
                    Queue<Pair> q=new LinkedList<>();
                    // HashSet<Pair> hs=new HashSet<>();
                    q.add(new Pair(i,j));
                    v[i][j]=1;
                    int cnt=0;
                    while(!q.isEmpty())
                    {
                        Pair t=q.poll();
                        // hs.add(t);
                        grid[t.x][t.y]=cmp;
                        cnt+=1;
                        for(int k=0;k<4;k++)
                        {
                            int nx=dx[k]+t.x;
                            int ny=dy[k]+t.y;
                            if(nx>=0 && nx<n && ny>=0 && ny<n && v[nx][ny]==0 && grid[nx][ny]==1)
                            {
                                v[nx][ny]=1;
                                q.add(new Pair(nx,ny));
                            }
                        }
                    }
                    hm.put(cmp,cnt);
                    ans=Math.max(ans,cnt);
                    cmp-=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    HashSet<Integer> hs=new HashSet<>();
                    for(int k=0;k<4;k++)
                    {
                        int nx=dx[k]+i;
                        int ny=dy[k]+j;
                        if(nx>=0 && nx<n && ny>=0 && ny<n && grid[nx][ny]<0)
                        hs.add(grid[nx][ny]);
                    }
                    int tval=0;
                    for(int k: hs)
                    tval+=hm.get(k);
                    ans=Math.max(ans,tval+1);
                }
            }
        }
        return ans;       
    }
}
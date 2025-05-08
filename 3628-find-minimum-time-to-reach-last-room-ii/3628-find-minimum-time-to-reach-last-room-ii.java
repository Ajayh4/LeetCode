class Pair
{
    int x,y,t,n=0;
    Pair(int a,int b,int c,int n)
    {
        x=a;
        y=b;
        t=c;
        this.n=n;
    }
    Pair(int a,int b,int c)
    {
        x=a;
        y=b;
        t=c;
    }
}
class Solution {
    public int minTimeToReach(int[][] mt) {
        int r=mt.length,c=mt[0].length;
        int sp[][]=new int[r][c];
        for(int i[]: sp)
        Arrays.fill(i,-1);
        sp[0][0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.t-b.t);
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty())
        {
            Pair t=pq.poll();
            int x=t.x+1,y=t.y;
            int ec=1;
            if(t.n%2==0)
            ec=1;
            else
            ec=2;
            if(x>=0 && x<r && y>=0 && y<c)
            {
                int at=mt[x][y]-t.t;
                if(at<=0)
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec<sp[x][y])
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec+at<sp[x][y])
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                }
            }
            x=t.x;y=t.y+1;
            if(x>=0 && x<r && y>=0 && y<c)
            {
                int at=mt[x][y]-t.t;
                if(at<=0)
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec<sp[x][y])
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec+at<sp[x][y])
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                }
            }
            x=t.x;y=t.y-1;
            if(x>=0 && x<r && y>=0 && y<c)
            {
                int at=mt[x][y]-t.t;
                if(at<=0)
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec<sp[x][y])
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec+at<sp[x][y])
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                }
            }
            x=t.x-1;y=t.y;
            if(x>=0 && x<r && y>=0 && y<c)
            {
                int at=mt[x][y]-t.t;
                if(at<=0)
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec<sp[x][y])
                    {
                        sp[x][y]=t.t+ec;
                        pq.add(new Pair(x,y,t.t+ec,t.n+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                    else if(mt[x][y]+t.t+ec+at<sp[x][y])
                    {
                        sp[x][y]=t.t+ec+at;
                        pq.add(new Pair(x,y,t.t+ec+at,t.n+1));
                    }
                }
            }
        }
        return sp[r-1][c-1];
    }
}
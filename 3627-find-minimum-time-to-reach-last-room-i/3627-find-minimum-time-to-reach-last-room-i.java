class Pair
{
    int x,y,t;
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
            if(x>=0 && x<r && y>=0 && y<c)
            {
                int at=mt[x][y]-t.t;
                if(at<=0)
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                    else if(mt[x][y]+t.t+1<sp[x][y])
                    {
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
                    }
                    else if(mt[x][y]+t.t+1+at<sp[x][y])
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
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
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                    else if(mt[x][y]+t.t+1<sp[x][y])
                    {
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
                    }
                    else if(mt[x][y]+t.t+1+at<sp[x][y])
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
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
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                    else if(mt[x][y]+t.t+1<sp[x][y])
                    {
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
                    }
                    else if(mt[x][y]+t.t+1+at<sp[x][y])
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
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
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                    else if(mt[x][y]+t.t+1<sp[x][y])
                    {
                        sp[x][y]=t.t+1;
                        pq.add(new Pair(x,y,t.t+1));
                    }
                }
                else
                {
                    if(sp[x][y]==-1)
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
                    }
                    else if(mt[x][y]+t.t+1+at<sp[x][y])
                    {
                        sp[x][y]=t.t+1+at;
                        pq.add(new Pair(x,y,t.t+1+at));
                    }
                }
            }
        }
        return sp[r-1][c-1];
    }
}
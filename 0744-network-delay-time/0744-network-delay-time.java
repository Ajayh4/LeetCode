class Pair
{
    int n,w;
    Pair(int a,int b)
    {
        n=a;
        w=b;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int sp[]=new int[n+1];
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        adj.add(new ArrayList<>());
        for(int i[]: times)
        {
            adj.get(i[0]).add(new Pair(i[1],i[2]));
        }
        // int sp[]=new int[n+1];
        Arrays.fill(sp,-1);
        sp[0]=0;
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b) -> a.w-b.w);
        q.add(new Pair(k,0));
        sp[k]=0;
        while(!q.isEmpty())
        {
            Pair t=q.poll();
            // sp[t.n]=t.w;
            for(Pair i: adj.get(t.n))
            {
                if(sp[i.n]==-1 || t.w+i.w<sp[i.n])
                {
                    sp[i.n]=t.w+i.w;
                    q.add(new Pair(i.n,t.w+i.w));
                }
            }
        }
        // System.out.println(Arrays.toString(sp));
        int ans=-1;
        for(int i: sp)
        {
            if(i==-1)return -1;
            ans=Math.max(ans,i);
        }
        return ans;
    }
}
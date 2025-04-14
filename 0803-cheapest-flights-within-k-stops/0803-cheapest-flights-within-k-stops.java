class Pair
{
    int n,w,s;
    Pair(int a,int b,int c)
    {
        n=a;
        w=b;
        s=c;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i[]: flights)
        adj.get(i[0]).add(new Pair(i[1],i[2],-1));
        Queue<Pair> pq=new LinkedList<>();
        pq.add(new Pair(src,0,0));
        int v[]=new int[n];
        // v[src]=1;
        int ans=Integer.MAX_VALUE;
        v=new int[n];
        int dist[]=new int[n];
        Arrays.fill(dist,-1);
        while(!pq.isEmpty())
        {
            Pair t=pq.poll();
            if(t.s>k)continue;
            // System.out.println(t.n+" "+t.w);
            for(Pair i: adj.get(t.n))
            {
                // if(v[i.n]==0)
                if((dist[i.n]==-1 || t.w+i.w<dist[i.n])){
                pq.add(new Pair(i.n,t.w+i.w,t.s+1));
                if(t.s<=k)
                dist[i.n]=t.w+i.w;
                }
            }
        }
        return dist[dst];
    }
}
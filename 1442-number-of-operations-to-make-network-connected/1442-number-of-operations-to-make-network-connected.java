class DisjointSet
{
    int n;
    int rank[];
    int parent[];
    DisjointSet(int n)
    {
        this.n=n;
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
            rank[i]=0;
        }
    }

    int findParent(int n)
    {
        if(parent[n]==n)
        return n;
        return parent[n]=findParent(parent[n]);
    }

    public boolean union(int u,int v)
    {
        int pu=findParent(u);
        int pv=findParent(v);

        if(pu==pv)
        return false;

        if(rank[pu]==rank[pv])
        {
            rank[pu]+=1;
            parent[pv]=pu;
        }
        else if(rank[pu]>rank[pv])
        parent[pv]=pu;
        else
        parent[pu]=pv;
        return true;
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisjointSet dj=new DisjointSet(n);
        int cnt=0;
        for(int i[]: connections)
        {
            if(!dj.union(i[0],i[1]))
            cnt+=1;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i: dj.parent)
        hs.add(dj.findParent(i));
        // System.out.println(Arrays.toString(dj.parent));
        if(hs.size()-1>cnt)
        return -1;
        return hs.size()-1;
    }
}